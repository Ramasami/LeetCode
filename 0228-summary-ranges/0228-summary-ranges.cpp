class Solution {
public:
    vector<string> summaryRanges(vector<int>& nums) {
        int l=0,r=0;
        int n = nums.size();
        vector<string> ans;
        while(r<n) {
            if(r == n-1 || nums[r]+1 != nums[r+1]) {
               check(l,r,nums,ans);
                l = r+1;
            }
            r++;
        }
        return ans;
    }
    void check(int l,int r, vector<int>& nums, vector<string>& ans) {
        if(l==r)
            ans.push_back(to_string(nums[l]));
        else
            ans.push_back(to_string(nums[l])+"->"+to_string(nums[r]));
    }
};