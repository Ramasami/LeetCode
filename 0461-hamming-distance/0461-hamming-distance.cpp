class Solution {
public:
    int hammingDistance(int x, int y) {
        x = x ^ y;
        int ans = 0;
        while(x!=0) {
            x=x&(x-1);
            ans++;
        }
        return ans;
    }
};