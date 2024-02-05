class Solution {
public:
    bool canPermutePalindrome(string s) {
        int c[26] = {0};
        for (int i=0;i<s.length();i++)
            c[s[i]-'a']++;
        bool single = false;
        for (int i=0;i<26;i++)
            if(c[i]%2!=0 && !single)
                single=!single;
            else if(c[i]%2!=0)
                return false;
        return true;
    }
};