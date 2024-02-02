class Solution {
public:
    int climbStairs(int n) {
        if (n ==1)
            return n;
        int twoBehind = 0;
        int oneBehind = 1;
        for(int i=2;i<=n;i++) {
            int curr = twoBehind + oneBehind;
            twoBehind = oneBehind;
            oneBehind = curr;
        }
        return twoBehind + oneBehind;
    }
};