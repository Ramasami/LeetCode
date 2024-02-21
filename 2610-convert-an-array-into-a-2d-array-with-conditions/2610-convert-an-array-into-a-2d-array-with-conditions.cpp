class Solution {
public:
    vector<vector<int>> findMatrix(vector<int>& nums) {
        int count[201]={0};
        
        int m = 0;
        for(int n:nums) {
            count[n]++;
            m = max(m, count[n]);
        }
        vector<vector<int>> ans;
        for(int i=0;i<m;i++)
            ans.push_back(vector<int>());
        for(int i=1;i<=200;i++) {
            for(int j=0;j<count[i];j++)
                ans[j].push_back(i);
        }
        return ans;
    }
};