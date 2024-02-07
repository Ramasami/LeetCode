class Solution {
public:
    bool isSubsequence(string s, string t) {
        int n = s.length();
        int i=0;
        for(int j=0;j<t.length();j++) {
            if(i==n)
                return true;
            if(s[i] == t[j]) {
                i++;
            }
        }
        return i == n;
    }
};