class Solution {
    public boolean validPath(int n, int[][] edges, int source, int destination) {
        if(source == destination)
            return true;
        Map<Integer, List<Integer>> adMat = new HashMap<>();
        boolean[] visited = new boolean[n];
        for(int[] edge: edges) {
            adMat.computeIfAbsent(edge[0], val->new LinkedList<>()).add(edge[1]);
            adMat.computeIfAbsent(edge[1], val->new LinkedList<>()).add(edge[0]);
        }
        Queue<Integer> q = new LinkedList<>();
        q.add(source);
        visited[source] = true;
        int curr;
        while(!q.isEmpty()) {
            curr = q.poll();
            for(int next: adMat.get(curr)) {
                if(!visited[next]) {
                    visited[next] = true;
                    if (next == destination)
                        return true;
                    q.add(next);
                }
            }
        }
        return false;
        
    }
}