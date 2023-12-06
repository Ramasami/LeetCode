class Solution {
public:
    bool isPalindrome(int x) {
        if(x<0)
            return false;
        unsigned y = 0;
        unsigned z = x;
        while(x) {
            y = y *10 + x%10;
            x/=10;
        }
        return y == z;
    }
};