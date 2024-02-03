class Solution {
public:
    int titleToNumber(string s) {
        long ans = 0;
        for(int i=0;i<s.length();i++)
            ans = ((ans * 26) - 64 + s[i]);
        return ans;
    }
};
