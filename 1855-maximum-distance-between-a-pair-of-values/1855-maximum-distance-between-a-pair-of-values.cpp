class Solution {
public:
    int maxDistance(vector<int>& nums1, vector<int>& nums2) {
        int l = 0, r = 0;
        int n = nums1.size(), m = nums2.size();
        int ans = 0;
        while(l<n) {
            int x = nums1[l];
            while(r<m) {
                if(nums2[r]<x)
                    break;
                r++;
            }
            ans = max(ans, r-l-1);
            l++;
        }
        return ans;
    }
};