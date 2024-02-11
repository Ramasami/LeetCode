class Solution {
public:
    int jump(vector<int>& nums) {
        int n = nums.size();
        int dp[n];
        for(int i=1;i<n;i++)
            dp[i] = 100000;
        dp[0] = 0;
        int max = 0;
        for(int i=0;i<n;i++) {
            if(nums[i]+i<max) {
                continue;
            }
            for(int j=max;j<=nums[i]+i&&j<n;j++) {
                dp[j] = min(dp[j], dp[i]+1);
                max = j;
            }
        }
         for(int i=0;i<n;i++) {
            cout<<dp[i]<<" ";   
        }
        cout<<"\n";
        return dp[n-1];
    }
};