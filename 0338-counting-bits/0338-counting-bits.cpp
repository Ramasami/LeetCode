class Solution {
public:
    vector<int> countBits(int n) {
        vector<int> ans(n+1);
        int next = 1;
        int prev = 0;
        for (int i=1;i<=n;i++) {
            if (i==next) {
                ans[i] = 1;
                prev = next;
                next = next << 1;
            } else {
                int rem = i - prev;
                ans[i] = ans[rem] + 1;
            }
        }
        return ans;
    }
};