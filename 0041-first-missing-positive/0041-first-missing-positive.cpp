class Solution {
public:
    int firstMissingPositive(vector<int>& nums) {
        int c = 10002;
        int n = nums.size();
        for(int i=0;i<n;i++)
            if(nums[i] == 0)
                nums[i] = c;
        for(int i=0;i<n;i++) {
            if(nums[i]<=n && nums[i] > 0) {
                parse(nums, nums[i]-1, n);
            }
        }
        for(int i=0;i<n;i++)
            if(nums[i]!=0)
                return i+1;
        return n+1;
    }
    
    void parse(vector<int>& nums, int i, int n) {
        int t = nums[i];
        nums[i] = 0;
        if(t<=n && t>0)
            parse(nums, t-1, n);
    }
};