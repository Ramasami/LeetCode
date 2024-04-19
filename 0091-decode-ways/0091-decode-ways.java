class Solution {
    public int numDecodings(String s) {
        int n1 = 1;
        int n2 = 1;
        int n = s.length();
        if(s.charAt(0) == '0')
            return 0;
        if(n ==1)
            return 1;
        for(int i=1;i<n;i++) {
            int x = 0;
            if(s.charAt(i) != '0')
                x+=n1;
            if((s.charAt(i-1) == '1') || (s.charAt(i)<='6' && s.charAt(i-1) == '2')) {
                x+=n2;
            } 
            
            n2=n1;
            n1=x;
        }
        return n1;
    }
}