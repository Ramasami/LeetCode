class Solution {
public:
    vector<vector<int>> findMatrix(vector<int>& nums) {
        int count[201]={0};
        vector<vector<int>> ans;
        int m = 0;
        for(int n:nums) {
            count[n]++;
            if(ans.size()<count[n])
                ans.push_back(vector<int>());
        }
        
        for(int i=1;i<=200;i++) {
            for(int j=0;j<count[i];j++)
                ans[j].push_back(i);
        }
        return ans;
    }
};