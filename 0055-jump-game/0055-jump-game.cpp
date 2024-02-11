class Solution {
public:
    bool canJump(vector<int>& nums) {
        int n = nums.size();
        int i = 0;
        int x = nums[i];
        for(;x>=0 && i < n;i++,x--) {
            if(nums[i] > x) {
                x = nums[i];
            }
        }
        return i>=n;
    }
};