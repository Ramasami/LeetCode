class Solution {
public:
    int climbStairs(int n) {
        if (n ==1)
            return 1;
        int twoBehind = 1;
        int oneBehind = 2;
        for(int i=3;i<=n;i++) {
            int curr = twoBehind + oneBehind;
            twoBehind = oneBehind;
            oneBehind = curr;
        }
        return oneBehind;
    }
};