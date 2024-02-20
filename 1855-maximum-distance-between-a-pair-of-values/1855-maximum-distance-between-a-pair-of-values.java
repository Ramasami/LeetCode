class Solution {
    public int maxDistance(int[] nums1, int[] nums2) {
        int l = 0, r = 0;
        int n = nums1.length, m = nums2.length;
        int ans = 0;
        while(l<n) {
            int x = nums1[l];
            while(r<m) {
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