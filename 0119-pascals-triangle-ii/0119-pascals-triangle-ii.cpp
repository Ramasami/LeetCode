class Solution {
public:
    vector<int> getRow(int rowIndex) {
        vector<int> ans(rowIndex+1);
        ans[0] = 1;
        int current = 0;
        int previous = 1;
        for (int i=1;i<=rowIndex;i++) {
            previous = 1;
            for(int j=1;j<i;j++) {
                current = ans[j]+previous;
                previous = ans[j];
                ans[j] = current;
            }
            ans[i] = 1;
        }
        return ans;
    }
};