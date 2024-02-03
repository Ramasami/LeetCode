class Solution {
    public int maxProfit(int[] prices) {
        int n = prices.length;
        int ans = 0;
        int m = prices[0];
        for(int i=1;i<n;i++) {
            if (m < prices[i])
                ans = Math.max(ans, prices[i] - m);
            else
                m = Math.min(m, prices[i]);
        }
        return ans;
    }
}