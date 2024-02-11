class Solution {
public:
    bool canJump(vector<int>& nums) {
        int n = nums.size();
        nums[n-1] = 1;
        int i = 0;
        int x = abs(nums[i]);
        while(x>=0 & i < n) {
            if(abs(nums[i]) > x) {
                x = abs(nums[i]);
            }
            nums[i] = -abs(nums[i]);
            i++;
            x--;
        }
        return nums[n-1] < 0;
    }
};