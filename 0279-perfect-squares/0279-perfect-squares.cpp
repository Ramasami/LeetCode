class Solution {
public:
    int numSquares(int n) {
        int dp[n+1];
        for(int i=0;i<=n;i++)
            dp[i] = INT_MAX;
        int s = (int)sqrt(n);
        int sq[s+1];
        dp[0] = 0;
        for(int i=0;i<=s;i++)
            sq[i] = i*i;
        for(int i=1;i<=n;i++) {
            for(int j = 1;j<=s;j++) {
                if(sq[j] > i)
                    break;
                dp[i] = min(dp[i], dp[i-sq[j]] + 1);
            }
        }
        return dp[n];
    }
};