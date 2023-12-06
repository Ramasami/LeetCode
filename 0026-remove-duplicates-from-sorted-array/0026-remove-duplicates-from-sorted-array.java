class Solution {
    public int removeDuplicates(int[] nums) {
        int l = 0;
        int r = 1;
        int n = nums.length;
        while(r<n) {
            if(nums[r] == nums[l]) {
                r++;
            } else if(nums[r] != nums[l]) {
                l++;
                nums[l] = nums[r];
            }
        }
        return l+1;
    }
}