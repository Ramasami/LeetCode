class Solution {
    public int[] productExceptSelf(int[] a) {
        int n = a.length;
        int[] ans = new int[n];
        Arrays.fill(ans, 1);
        int l = 1;
        int r = 1;
        for(int i=1;i<n;i++) {
            l *= a[i-1];
            r *= a[n-i];
            ans[i]*=l;
            ans[n-i-1]*=r;
        }
        return ans;
    }
}