class Solution {
    public boolean canArrange(int[] arr, int k) {
        int[] m = new int[k/2+2];
        for(int i: arr) {
            if (i < 0)
                i = (i%k)+k;
            i%=k;
            if (i!=0) {
                if(i>k/2)
                   m[k-i]--; 
                else
                    m[i]++;
            }
            
        }
        for(int i=1;i<=(k-1)/2;i++) {
            if(m[i]!=0) {
                return false;
            }
        }
        if((k&1)==0) {
            if((m[k/2]&1)==1) {
                return false;
                
            }
        }
        return true;
    }
}