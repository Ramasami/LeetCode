class Solution {
public:
    bool isPalindrome(string s) {
        int l = 0;
        int r = s.length()-1;
        while(l<r) {
            char leftChar = toupper(s[l]);
            char rightChar = toupper(s[r]);
            bool left = isAlphaNumberic(leftChar);
            bool right = isAlphaNumberic(rightChar);
            if(!left)
                l++;
            if (!right)
                r--;
            if(left && right) {
                if(leftChar != rightChar)
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