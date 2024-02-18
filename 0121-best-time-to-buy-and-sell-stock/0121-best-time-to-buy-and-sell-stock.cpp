class Solution {
public:
    int maxProfit(vector<int>& prices) {
        int n = prices.size();
        int ans = 0;
        int m = prices[0];
        for(int i=1;i<n;i++) {
            if (m < prices[i])
                ans = max(ans, prices[i] - m);
            else
                m = min(m, prices[i]);
        }
        return ans;
    }
};