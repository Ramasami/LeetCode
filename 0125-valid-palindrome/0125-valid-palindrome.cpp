class Solution {
public:
    bool isPalindrome(string s) {
        int l = 0;
        int r = s.length()-1;
        while(l<r) {
            bool left = isAlphaNumberic(toupper(s[l]));
            bool right = isAlphaNumberic(toupper(s[r]));
            if(!left)
                l++;
            if (!right)
                r--;
            if(left && right) {
                if(toupper(s[l]) != toupper(s[r]))
                    return false;
                l++;
                r--;
            }
        }
        return true;
    }
    
    bool isAlphaNumberic(char c) {
        return (c >= 'A' && c <= 'Z')
            || (c >= '0' && c <= '9');
    }
};