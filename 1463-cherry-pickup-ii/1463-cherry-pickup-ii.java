class Solution {
    public int cherryPickup(int[][] grid) {
        int n = grid.length;
        int m = grid[0].length;
        int[][][] dp = new int[n][m][m];
        for(int i=0;i<m;i++) {
            for(int j=0;j<m;j++) {
                dp[0][i][j]=-1;
            }
        }
        dp[0][0][m-1] = grid[0][0] + grid[0][m-1];
        for(int i=1;i<n;i++) {
            for(int r1=0;r1<m;r1++) {
                for(int r2=0;r2<m;r2++) {
                    int score = 0;
                    score = grid[i][r1];
                    if(r1 != r2)
                        score += grid[i][r2];
                    int max = -1;
                    for (int c1 = r1 - 1; c1 <= r1 + 1; c1++) {
                        for (int c2 = r2 - 1; c2 <= r2 + 1; c2++) {
                            if (c1 >= 0 && c1 < m && c2 >= 0 && c2 < m) {
                                max = Math.max(max, dp[i - 1][c1][c2]);
                            }
                        }
                    }
                    if(max != -1)
                        dp[i][r1][r2] = score + max;
                    else
                        dp[i][r1][r2] = -1;
                }
            }
        }
        return getMax(dp[n-1], m);
    }
    
    private int getMax(int[][] grid, int m) {
        int max = 0;
        for(int i=0;i<m;i++) {
            for(int j=0;j<m;j++) {
                max = Math.max(max, grid[i][j]);
            }
        }
        return max;
    }
}