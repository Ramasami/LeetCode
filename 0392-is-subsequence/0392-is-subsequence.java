class Solution {
    public boolean isSubsequence(String s, String t) {
        char[] sc = s.toCharArray();
        int n = sc.length;
        int i=0;
        for(char c:t.toCharArray()) {
            if(i==n)
                return true;
            if(sc[i] == c) {
                i++;
                
            }
        }
        return i == n;
    }
}