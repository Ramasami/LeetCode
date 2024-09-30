class Solution {
    public boolean isValidSudoku(char[][] board) {
        for(int i=0;i<9;i++) {
            int v = 0;
            int h = 0;
            for(int j=0;j<9;j++) {
                if(board[i][j] != '.') {
                    if((v & 1<< (board[i][j]-1)) >0)
                        return false;
                    else
                        v = v | (1 << (board[i][j]-1));
                }
                if(board[j][i] != '.') {
                    if((h & 1<< (board[j][i]-1)) >0)
                        return false;
                    else
                        h = h | (1 << (board[j][i]-1));
                }
                
                if(i%3==0 && j%3==0) {
                    int b = 0;
                    for(int x = i;x<i+3;x++) {
                        for(int y = j;y<j+3;y++) {
                            if(board[x][y] != '.') {
                                if((b & 1<< (board[x][y]-1)) >0)
                                    return false;
                                else
                                    b = b | (1 << (board[x][y]-1));
                            }
                        }
                    }
                }
            }
        }
        return true;
    }
}