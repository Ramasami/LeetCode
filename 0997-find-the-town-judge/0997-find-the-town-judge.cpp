class Solution {
public:
    int findJudge(int n, vector<vector<int>>& trust) {
            if (trust.size() < n - 1) {
            return -1;
        }

        int indegrees[n + 1];
        int outdegrees[n + 1];
        
        fill(indegrees, indegrees+n+1, 0);
        fill(outdegrees, outdegrees+n+1, 0);

        for (auto relation : trust) {
            outdegrees[relation[0]]++;
            indegrees[relation[1]]++; 
        }

        for (int i = 1; i <= n; i++) {
            if (indegrees[i] == n - 1 && outdegrees[i] == 0) {
                return i;
            }
        }
        return -1;
    }
};