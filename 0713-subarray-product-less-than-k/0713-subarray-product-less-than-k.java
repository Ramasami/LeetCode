class Solution {
    public int numSubarrayProductLessThanK(int[] nums, int k) {
        if(k<=1)
            return 0;
        int l = 0, r = 0;
        int product = 1;
        int n = nums.length;
        int ans = 0;
        while(r<n) {
            product*=nums[r];  
            while (product >= k) {
                product /= nums[l++];
            }
            ans += r - l + 1;
            r++;
        }
        return ans;
        
    }
}