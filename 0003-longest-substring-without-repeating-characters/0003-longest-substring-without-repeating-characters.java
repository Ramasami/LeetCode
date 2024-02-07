class Solution {
    public int lengthOfLongestSubstring(String s) {
        int maxLength = 0;
        int l = -1;
        Integer[] charPosition = new Integer[256];
        for (int i=0;i<s.length();i++) {
            char c = s.charAt(i);
            if(charPosition[c] == null) { 
                maxLength = Math.max(maxLength, i-l);
            } else {
                l = Math.max(l,charPosition[(int)c]);
                maxLength = Math.max(maxLength, i-l);
            }
            charPosition[c] = i;
        }
        return maxLength;
    }
}