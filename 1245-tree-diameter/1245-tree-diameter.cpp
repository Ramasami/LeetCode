class Solution {
public:
    int treeDiameter(vector<vector<int>>& edges) {
        vector<unordered_set<int>> graph;
        for (int i = 0; i < edges.size() + 1; ++i) {
            graph.push_back(unordered_set<int>());
        }
        for (vector<int> edge : edges) {
            int u = edge[0], v = edge[1];
            graph[u].insert(v);
            graph[v].insert(u);
        }

        queue<int> leaves;
        for (int vertex = 0; vertex < graph.size(); ++vertex) {
            if (graph[vertex].size() == 1)
                leaves.push(vertex);
        }

        int layers = 0;
        int vertexLeft = edges.size() + 1;
        while (vertexLeft > 2) {
            vertexLeft -= leaves.size();

            queue<int> nextLeaves;

            while (!leaves.empty()) {
                int leaf = leaves.front();
                leaves.pop();
                int neighbor = *(graph[leaf].begin());
                graph[neighbor].erase(leaf);
                if (graph[neighbor].size() == 1)
                    nextLeaves.push(neighbor);
            }

            layers += 1;
            leaves = nextLeaves;
        }

        if (vertexLeft == 1)
            return layers * 2;
        else
            return layers * 2 + 1;
        
    }
};