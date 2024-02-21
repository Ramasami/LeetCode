class Solution {
public:
    vector<vector<int>> findMatrix(vector<int>& nums) {
        int count[201]={0};
        vector<vector<int>> ans;
        int i,j;
        for(int n:nums) {
            count[n]++;
            if(ans.size()<count[n])
                ans.push_back(vector<int>());
        }
        
        for(i=1;i<=200;i++) {
            for(j=0;j<count[i];j++)
                ans[j].push_back(i);
        }
        return ans;
    }
};