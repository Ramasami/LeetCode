class Solution {
    public int[] countBits(int n) {
        int[] ans = new int[n+1];
        int two = 1;
        int j = 2; 
        for(int i=1;i<=n;i++) {
            ans[i] = 1 + ans[i-j/2];
            if(i+1 == j)
                j*=2;
        }
        return ans;
    }
}