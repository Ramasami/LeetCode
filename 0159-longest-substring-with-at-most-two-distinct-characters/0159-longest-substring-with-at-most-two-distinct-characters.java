class Solution {
    public int lengthOfLongestSubstringTwoDistinct(String s) {
        Character a=null,b=null;
        int na = 0, nb = 0;
        int l=0,r=0;
        int n = s.length();
        int ans = 0;
        while(r<n) {
            Character c = s.charAt(r);
            if(na == 0) {
                a = c;na = 1;
            } else if (nb == 0 && c!=a) {
                b = c;nb = 1;
            } else if (c == a) {
                na++;
            } else if (c == b) {
                nb++;
            } else {
                while(l<r && na>0 && nb>0) {
                    if(s.charAt(l) == a) {
                        na--;
                    } else if(s.charAt(l) == b) {
                        nb--;
                    }
                    l++;
                }
                if(na == 0) {
                    a = c;na = 1;
                } else {
                    b = c;nb = 1;
                }
                    
            }
            r++;
            ans = Math.max(ans, r-l);
        }
        return ans;
    }
}