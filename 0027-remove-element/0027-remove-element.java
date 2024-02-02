class Solution {
    public int removeElement(int[] nums, int val) {
        int l = 0;
        int r = nums.length-1;
        while(l<=r) {
            if(nums[l] != val) 
                l++;
            else {
                nums[l] = nums[r];
                r--;
            }
        }
        return l;
    }
}