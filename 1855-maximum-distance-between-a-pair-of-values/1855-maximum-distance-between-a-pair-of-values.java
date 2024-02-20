class Solution {
    public int maxDistance(int[] nums1, int[] nums2) {
        int l = 0, r = 0;
        int ans = 0;
        while(l<nums1.length) {
            int x = nums1[l];
            while(r<nums2.length) {
                if(nums2[r]<x)
                    break;
                r++;
            }
            ans = Math.max(ans, r-l-1);
            l++;
        }
        return ans;
    }
}