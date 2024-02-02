class Solution {
    public int mySqrt(int x) {
        long l = 0;
        long r = x;
        while(l<r) {
            long m = l+(r-l)/2;
            if(x<m*m) r = m-1;
            else if(x == m) return (int)m;
            else if (m*m + 1 + 2*m > x) return (int)m;
            else l = m+1;
        }
        return (int)l;
    }
}