class Solution {
    public boolean validPath(int n, int[][] edges, int source, int destination) {
        if(source == destination)
            return true;
        Map<Integer, LinkedList<Integer>> adMat = new HashMap<>();
        Set<Integer> visited = new HashSet<>();
        for(int[] edge: edges) {
            adMat.compute(edge[0], (k,v)->{
                v = v == null?new LinkedList<>():v;
                v.add(edge[1]);
                return v;
            });
            adMat.compute(edge[1], (k,v)->{
                v = v == null?new LinkedList<>():v;
                v.add(edge[0]);
                return v;
            });
        }
        Queue<Integer> q = new LinkedList<>();
        q.add(source);
        int curr;
        while(!q.isEmpty()) {
            curr = q.poll();
            for(int next: adMat.get(curr)) {
                if(!visited.contains(next)) {
                    visited.add(next);
                    if (next == destination)
                        return true;
                    q.add(next);
                }
            }
        }
        return false;
        
    }
}