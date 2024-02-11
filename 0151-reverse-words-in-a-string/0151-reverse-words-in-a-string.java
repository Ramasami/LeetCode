class Solution {
    public String reverseWords(String s) {
        int l = 0;
        int r = s.length()-1;
        StringBuilder sb = new StringBuilder();
        while(s.charAt(l)==' ') l++;
        while(s.charAt(r)==' ') r--;
        while(l<=r) {
            if(s.charAt(r) != ' ' || s.charAt(r-1) != ' ') {
                sb.append(s.charAt(r));
            }
            r--;
        }
        l = 0;
        for(r=0;r<=sb.length();r++) {
            if(r == sb.length() || sb.charAt(r) == ' ') {
                reverse(sb, l, r-1);
                l = r+1;
            }
        }
        return sb.toString();
    }
    
    private void reverse(StringBuilder sb, int l,int r) {
        while(r>l) {
            char c = sb.charAt(r);
            sb.setCharAt(r, sb.charAt(l));
            sb.setCharAt(l, c);
            r--;
            l++;
        }
    }
}