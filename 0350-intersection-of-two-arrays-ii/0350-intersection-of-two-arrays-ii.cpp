class Solution {
public:
    vector<int> intersect(vector<int>& nums1, vector<int>& nums2) {
        int a[1001];
        vector<int> ans;
        int n1 = nums1.size();
        int n2 = nums2.size();
        for(int i=0;i<n1;i++)
            a[nums1[i]]++;
        for(int i=0;i<n2;i++)
            if(a[nums2[i]]>0) {
                ans.push_back(nums2[i]);
                a[nums2[i]]--;
            }
        return ans;
                
    }
};