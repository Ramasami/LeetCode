class Solution {
public:
    int totalMoney(int n) {
        int w = n/7;
        int ans = 28 * w + w * (w-1) * 7 / 2;
        int d = n%7;
        ans+=d * (2*(w+1) + (d-1)) / 2;
        return ans;
    }
};