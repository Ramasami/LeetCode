class Solution {
public:
    int removeElement(vector<int>& nums, int val) {
        int l = 0;
        int r = 0;
        int n = nums.size();
        while(r<n) {
            if(nums[r] == val) {
                r++;
            } else if (l == r) {
                l++;
                r++;
            } else {
                nums[l] = nums[r];
                l++;
                r++;
            }
        }
        return l;
    }
};