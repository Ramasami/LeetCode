class Solution {
    public int candy(int[] a) {
        int n = a.length;
        int[] ans = new int[n];
        for(int i=0;i<n;i++)
            ans[i] = 1;
        boolean run = true;
        while(run) {
            run = false;
            for(int i=0;i<n;i++) {
                if(i!=n-1 && a[i]>a[i+1] && ans[i]<= ans[i+1]) {
                    run = true;
                    ans[i] = ans[i+1]+1;
                }
                if(i!=0 && a[i]>a[i-1] && ans[i]<= ans[i-1]) {
                    run = true;
                    ans[i] = ans[i-1]+1;
                }
            }
        }
        
        
        return Arrays.stream(ans).sum();
    }
}