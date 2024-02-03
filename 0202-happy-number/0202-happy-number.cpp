class Solution {
public:
    bool isHappy(int n) {
        while(n!=1 && n!=4) {
            int sum = 0;
            int t = n;
            while(t!=0) {
                int digit = t%10;
                t/=10;
                sum+=digit*digit;
            }
            n = sum;
        }
        return n == 1;
    }
};