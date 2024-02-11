class Solution {
public:
    int jump(vector<int>& nums) {
        int n = nums.size();
        int dp[n];
        for(int i=1;i<n;i++)
            dp[i] = 100000;
        dp[0] = 0;
        for(int i=0;i<n;i++) {
            for(int j=1;j<=nums[i]&&i+j<n;j++) {
                dp[i+j] = min(dp[i+j], dp[i]+1);
            }
        }
        // for(int i=0;i<n;i++) {
        //     cout<<dp[i]<<" ";   
        // }
        // cout<<"\n";
        return dp[n-1];
    }
};