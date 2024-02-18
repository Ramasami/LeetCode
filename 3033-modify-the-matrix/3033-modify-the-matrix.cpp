class Solution {
public:
    vector<vector<int>> modifiedMatrix(vector<vector<int>>& matrix) {
        int n=matrix.size();
        int m=matrix[0].size();
        for(int i=0;i<m;i++) {
            int k=0;
            for(int j=0;j<n;j++) {
                k=max(k,matrix[j][i]);
            }
            for(int j=0;j<n;j++) {
                if(matrix[j][i]==-1)
                    matrix[j][i]=k;
            }
        }
        return matrix;
    }
};