class Solution {
    public boolean canArrange(int[] arr, int k) {
        int[] m = new int[k];
        for(int i: arr)
            m[((i%k)+k)%k]++;
        for(int i=1;i<=(k-1)/2;i++) {
            if(m[i]!=m[k-i]) {
                return false;
            }
        }
        if(k%2==0) {
            if(m[k/2]%2==1) {
                return false;
                
            }
        }
        return true;
    }
}