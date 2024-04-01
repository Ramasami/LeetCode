class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int l = 0;
        int r = 0;
        int sum = 0;
        int n = nums.length;
        int ans = Integer.MAX_VALUE;
        while(r<n) {
            sum+=nums[r];
            while(sum>=target && l<=r) {
                ans = Math.min(ans, r-l+1);
                sum-=nums[l];
                l++;
            }
            r++;
        }
        return ans == Integer.MAX_VALUE?0:ans;
    }
}