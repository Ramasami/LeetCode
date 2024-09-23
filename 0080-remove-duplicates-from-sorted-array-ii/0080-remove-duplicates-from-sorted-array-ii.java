class Solution {
    public int removeDuplicates(int[] nums) {
        int l = 2;
        int n = nums.length;
        for(int i = 2;i<n;i++) {
            if(nums[i] == nums[l-1] && nums[i] == nums[l-2]) {
                //
            } else {
                nums[l++] = nums[i];
            }
        }
        return l;
    }
}