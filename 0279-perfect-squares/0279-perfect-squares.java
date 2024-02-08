class Solution {
    public int numSquares(int n) {
        int dp[] = new int[n+1];
        Arrays.fill(dp, Integer.MAX_VALUE);
        int s = (int)Math.sqrt(n);
        int sq[] = new int[s+1];
        dp[0] = 0;
        for(int i=0;i<=s;i++)
            sq[i] = i*i;
        for(int i=1;i<=n;i++) {
            for(int j = 1;j<=s;j++) {
                if(sq[j] > i)
                    break;
                dp[i] = Math.min(dp[i], dp[i-sq[j]] + 1);
            }
        }
        return dp[n];
    }
}