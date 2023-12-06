class Solution {
public:
    vector<vector<int>> generate(int numRows) {
        vector<vector<int>> ans;
        ans.push_back(vector<int>{1});
        for(int i = 2,j=0;i<=numRows;i++,j++) {
            vector<int> row(i);
            row[0] = 1;
            row[i-1] = 1;
            for(int k = 1;k<i-1;k++) {
                row[k] = ans[j][k-1] + ans[j][k];
            }
            ans.push_back(row);
        }
        return ans;
    }
};