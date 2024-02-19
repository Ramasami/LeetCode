class Solution {
    public void rotate(int[][] matrix) {
        int n = matrix.length;
        int t;
        for(int i=0;i<n;i++) {
            for(int j=0;j<i;j++) {
                t = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = t;
            }
        }
        
        for(int i=0;i<n;i++) {
            for(int j=0;j<n/2;j++) {
                t = matrix[i][j];
                matrix[i][j] = matrix[i][n-j-1];
                matrix[i][n-j-1] = t;
            }
        }
    }
}