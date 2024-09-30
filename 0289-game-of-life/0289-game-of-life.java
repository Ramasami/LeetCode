class Solution {
    
    
    // 0 dead
    // 1 alive
    // 2 was dead, now alive
    // 3 was alive now dead
    public void gameOfLife(int[][] board) {
        int n = board.length;
        int m = board[0].length;
        for(int i=0;i<n;i++) {
            for(int j=0;j<m;j++) {
                
                int ans = 0;
                int x = i, y = j;
                if (x != n-1) {
                    ans+=(board[x+1][y]%2);
                    if (y != m-1)
                        ans+=(board[x+1][y+1]%2);
                    if (y != 0)
                        ans+=(board[x+1][y-1]%2);
                }
                if (x != 0) {
                    ans+=(board[x-1][y]%2);
                    if (y != m-1)
                        ans+=(board[x-1][y+1]%2);
                    if (y != 0)
                        ans+=(board[x-1][y-1]%2);
                }
                if (y != m-1)
                    ans+=(board[x][y+1]%2);
                if (y != 0)
                    ans+=(board[x][y-1]%2);
                int neighbour = ans;
                int curr = board[i][j];
                if (neighbour < 2 && curr == 1) {
                    board[i][j] = 3;
                } else if (neighbour == 3 && curr == 0) {
                    board[i][j] = 2;
                } else if (neighbour > 3 && curr == 1) {
                    board[i][j] = 3;
                }
            }
        }
        
        for(int i=0;i<n;i++) {
            for(int j=0;j<m;j++) {
                 if (board[i][j] >= 2)
                     board[i][j] = 3-board[i][j];
            }
        }
    }
    
}