class Solution {
public:
    int mySqrt(int x) {
        if (x<2)
            return x;
        int a = mySqrt(x>>2) << 1;
        return (long)(a+1) * (long)(a+1) > x ?a:a+1;   
    }
};