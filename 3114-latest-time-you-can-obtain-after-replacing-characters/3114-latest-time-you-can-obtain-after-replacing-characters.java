class Solution {
    public String findLatestTime(String s) {
        StringBuilder ans = new StringBuilder();
        if(s.charAt(0) == '?' && s.charAt(1) == '?') {
            ans.append("11");
        } else if(s.charAt(0) == '?') {
            if(s.charAt(1) <= '1')
                ans.append("1").append(s.charAt(1));
            else
                ans.append("0").append(s.charAt(1));
        } else if(s.charAt(1) == '?') {
            if(s.charAt(0) == '0')
                ans.append(s.charAt(0)).append("9");
            else
                ans.append("11");
        } else {
            ans.append(s.charAt(0)).append(s.charAt(1));
        }
        ans.append(':');
        
        if(s.charAt(3) == '?' && s.charAt(4) == '?') {
            ans.append("59");
        } else if(s.charAt(3) == '?') {
            ans.append("5").append(s.charAt(4));
        } else if(s.charAt(4) == '?') {
            ans.append(s.charAt(3)).append('9');
        } else {
            ans.append(s.charAt(3)).append(s.charAt(4));
        }
        return ans.toString();
    }
}