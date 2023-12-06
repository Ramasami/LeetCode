class Solution {
public:
    int strStr(string haystack, string needle) {
        int l = 0, r = 0;
        int n = needle.length();
        int h = haystack.length();
        if (n == 0)
            return 0;
        if (n > h)
            return -1;
        for (int i=0;i<h - n + 1;i++) {
            bool flag = true;
            for(int j=0;j<n;j++) {
                if (needle[j]!=haystack[i+j]) {
                    flag = false;
                    break;
                }
            }
            if (flag)
                return i;
        }
        
        return -1;
    }
};