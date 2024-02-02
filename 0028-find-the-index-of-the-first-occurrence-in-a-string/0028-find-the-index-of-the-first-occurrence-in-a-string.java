class Solution {
    public int strStr(String haystack, String needle) {
        int hayStackLength = haystack.length();
        int needleLength = needle.length();
        for(int i=0;i<hayStackLength - needleLength + 1;i++) {
            boolean passed = true;
            for(int j = i, k=0;k<needleLength;j++,k++) {
                if(needle.charAt(k) != haystack.charAt(j)) {
                    passed = false;
                    break;
                }
            }
            if(passed)
                return i;
        }
        return -1;
    }
}