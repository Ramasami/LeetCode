class Solution {
    public int numIslands(char[][] grid) {
        int n = grid.length;
        int m = grid[0].length;
        int[] x = new int[]{0,0,1,-1};
        int[] y = new int[]{1,-1,0,0};
        Queue<Pair<Integer, Integer>> q = new LinkedList<>();
        int islands = 0;
        for(int i=0;i<n;i++) {
            for(int j=0;j<m;j++) {
                if(grid[i][j] == '0')
                    continue;
                islands++;
                q.add(new Pair<>(i, j));
                grid[i][j] = '0';
                find(grid, q, x, y, n, m);
            }
        }
        return islands;
    }
    
    private void find(char[][] grid, Queue<Pair<Integer, Integer>> q,int[] x,int[] y, int n, int m) {
        int i,j,k,a,b;
        while(!q.isEmpty()) {
            Pair<Integer, Integer> p = q.remove();
            i = p.getKey();
            j = p.getValue();
            for(k=0;k<4;k++) {
                a = i + x[k];
                b = j + y[k];
                if(a>=0 && a<n && b>=0 && b<m && grid[a][b] == '1') {
                    grid[a][b] = '0';
                    q.add(new Pair<>(a, b));
                }
            }
        }
    }
}