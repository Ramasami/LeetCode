class Solution {
    public String findLatestTime(String s) {
        String ans = null;
        if(s.charAt(0) == '?' && s.charAt(1) == '?') {
            ans="11:";
        } else if(s.charAt(0) == '?') {
            if(s.charAt(1) <= '1') {
                ans="1"+s.charAt(1)+":";
            } else {
                ans="0"+s.charAt(1)+":";
            }
        } else if(s.charAt(1) == '?') {
            if(s.charAt(0) == '0')
                ans=s.charAt(0)+"9:";
            else
                ans="11:";
        } else {
            ans=s.charAt(0) + "" + s.charAt(1) + ":";
        }
        
        if(s.charAt(3) == '?' && s.charAt(4) == '?') {
            ans+="59";
        } else if(s.charAt(3) == '?') {
            ans+="5"+s.charAt(4);
        } else if(s.charAt(4) == '?') {
            ans+=s.charAt(3)+"9";
        } else {
            ans+=s.charAt(3) + "" + s.charAt(4);
        }
        return ans;
    }
}