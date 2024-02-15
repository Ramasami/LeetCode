class Solution {
public:
    long long largestPerimeter(vector<int>& nums) {
        long ans = -1;
        long sum = 0;
        int n = nums.size();
        sort(nums.begin(),nums.end());
        for(int i=0;i<n;i++) {
            if(sum>nums[i])
                ans = sum + nums[i];
            sum+=nums[i];
        }
        return ans;
    }
};