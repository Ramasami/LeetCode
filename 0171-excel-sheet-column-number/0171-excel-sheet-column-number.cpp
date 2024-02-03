class Solution {
public:
    int titleToNumber(string s) {
        long ans = 0;
        for(int i=0;i<s.length();i++)
            ans = ((ans * 26) + s[i] - 64);
        return ans;
    }
};
