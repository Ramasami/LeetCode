class Solution {
public:
    vector<int> rearrangeArray(vector<int>& nums) {
        int l = nums.size();
        int p=0,n=0;
        vector<int> ans(l);
        for(int i=0;i<l;i++) {
            if(nums[i]>0) {
                ans[2*p]=nums[i];
                p++;
            }
            else{
                ans[2*n+1]=nums[i];
                n++;
            }
        }
        return ans;
    }
};