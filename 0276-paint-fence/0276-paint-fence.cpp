class Solution {
public:
    int numWays(int n, int k) {
        if(n==1)
            return k;
        if(n==2)
            return k*k;
        int n0=0;
        int n1=k*k;
        int n2=k;
        for(int i=3;i<=n;i++) {
            n0 = (k-1)*(n1+n2);
            n2 = n1;
            n1 = n0;
        }
        
        return n0;
    }
};