class Solution {
public:
    int cherryPickup(vector<vector<int>>& grid) {
        int n = grid.size();
        int m = grid[0].size();
        vector<vector<vector<int>>> dp;
        for(int i=0;i<n;i++) {
            vector<vector<int>> row;
            for(int j=0;j<m;j++) {
                vector<int> r1;
                for(int i=0;i<m;i++) {
                    r1.push_back(-1);
                }
                row.push_back(r1);
            }
            dp.push_back(row);
        }
        dp[0][0][m-1] = grid[0][0] + grid[0][m-1];
        for(int i=1;i<n;i++) {
            for(int r1 = 0;r1<m;r1++) {
                for(int r2 = 0;r2 < m;r2++) {
                    int score = grid[i][r1];
                    if(r1!=r2)
                        score+=grid[i][r2];
                    int big = -1;
                    for(int c1=r1-1;c1<=r1+1;c1++) {
                        for(int c2=r2-1;c2<=r2+1;c2++) {
                            
                            if (c1 >= 0 && c1 < m && c2 >= 0 && c2 < m) {
                        
                                big = max(big, dp[i-1][c1][c2]);
                            }
                        }
                    }
                    if(big == -1)
                        score = -1;
                    else
                        score += big;
                    dp[i][r1][r2] = score;
                }
            }
        }
        int big = 0;
        for(int i=0;i<m;i++)
            for(int j=0;j<m;j++)
                big = max(dp[n-1][i][j], big);
        return big;
    }
};