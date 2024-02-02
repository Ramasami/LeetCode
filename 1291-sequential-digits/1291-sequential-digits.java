class Solution {
    
    private static final int[] tens = {1,10,100,1_000,10_000,100_000, 1_000_000, 10_000_000, 100_000_000, 1_000_000_000};
    
    public List<Integer> sequentialDigits(int low, int high) {
 
        int lowSize = getLen(low);
        int highSize = getLen(high);
        List<Integer> ans = new ArrayList<>();
        
        int n = 0;
        
        for(int i=1;i<10;i++) {
            n = i;
            int last = i;
            for(int j=0;j<highSize;j++) {
                if(last == 9)
                    break;
                n=n*10+(++last);
                if (n>=low && n<=high) {
                    ans.add(n);
                }
            }
        }
        ans.sort((o1,o2)->o1-o2);
        return ans;
        
        
        
    }
    
    private int getLen(int num) {
        int cur = num;
        int ret = 0;

        while (cur > 0) {
            cur = cur / 10;
            ret++;
        }
        
        return ret;
    }
   
}