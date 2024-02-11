class Solution {
public:
    bool canJump(vector<int>& nums) {
        int n = nums.size();
        int i = 0;
        int x = nums[i];
        while(x>=0 && i < n) {
            if(nums[i] > x) {
                x = nums[i];
            }
            i++;
            x--;
        }
        return i>=n;
    }
};