class Solution {
public:
    bool isHappy(int n) {
        while(n!=1 && n!=4) {
            int t = n;
            n = 0;
            while(t!=0) {
                int digit = t%10;
                t/=10;
                n+=digit*digit;
            }
        }
        return n == 1;
    }
};