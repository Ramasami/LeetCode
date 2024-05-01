class Solution {
    public long countPairs(int[] nums1, int[] nums2) {
        int n = nums2.length;
        for(int i=0;i<n;i++) {
            nums1[i]-=nums2[i];
        }
        Arrays.sort(nums1);
        int r = n-1;
        int l = 0;
        long ans = 0;
        while(l<r) {
            if(nums1[l]+nums1[r]<=0) {
                l++;
            } else {
                ans+=r-l;
                r--;
            }
        }
        return ans;
    }
}