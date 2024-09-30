class Solution {
    public boolean isValidSudoku(char[][] board) {
        for(int i=0;i<9;i++) {
            int[] v = new int[9];
            int[] h = new int[9];
            for(int j=0;j<9;j++) {
                if(board[i][j] != '.') {
                    if(v[board[i][j]-'1'] == 1)
                        return false;
                    else
                        v[board[i][j]-'1'] = 1;
                }
                if(board[j][i] != '.') {
                    if(h[board[j][i]-'1'] == 1)
                        return false;
                    else
                        h[board[j][i]-'1'] = 1;
                }
                
                if(i%3==0 && j%3==0) {
                    int[] b = new int[9];
                    for(int x = i;x<i+3;x++) {
                        for(int y = j;y<j+3;y++) {
                            if(board[x][y] != '.') {
                                if(b[board[x][y]-'1'] == 1)
                                    return false;
                                else
                                    b[board[x][y]-'1'] = 1;
                            }
                        }
                    }
                }
            }
        }
        return true;
    }
}