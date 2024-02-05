class Solution {
public:
    void moveZeroes(vector<int>& nums) {
        int l = 0,r = 0;
        int n = nums.size();
        while (r<n) {
            if (nums[r] != 0) {
                nums[l++] = nums[r];
            }
            r++;
        }
        while(l<n)
            nums[l++] = 0;
    }
};