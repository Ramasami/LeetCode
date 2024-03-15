class Solution {
    public int[] productExceptSelf(int[] a) {
        int n = a.length;
        int[] ans = new int[n];
        Arrays.fill(ans, 1);
        int l = 1;
        int r = 1;
        for(int i=0;i<n;i++) {
            if(i>0) {
                l *= a[i-1];
                r *= a[n-i];
            }
            ans[i]*=l;
            ans[n-i-1]*=r;
        }
        return ans;
    }
}