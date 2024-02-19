class Solution {
public:
    vector<vector<int>> divideArray(vector<int>& nums, int k) {
        sort(nums.begin(),nums.end());
        int n=nums.size();
        int n3 = n/3;
        for(int i=0;i<n3;i++) {
            if(nums[3*i+2]-nums[3*i]>k)
                return vector<vector<int>>();
        }
        vector<vector<int>> ans;
        for(int i=0;i<n3;i++) {
            ans.push_back(vector<int>{nums[3*i],nums[3*i+1],nums[3*i+2]});
        }
        return ans;
    }
};