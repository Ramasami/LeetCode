class Solution {
    public boolean canJump(int[] nums) {
        int n = nums.length;
        nums[n-1] = 1;
        int i = 0;
        int x = nums[i];
        while(x>=0 & i < n) {
            if(nums[i] > x) {
                x = nums[i];
            }
            nums[i] = -nums[i];
            i++;
            x--;
        }
        return nums[n-1] < 0;
    }
}