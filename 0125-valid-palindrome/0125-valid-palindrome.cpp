class Solution {
public:
    bool isPalindrome(string s) {
        int l = 0;
        int r = s.length()-1;
        while(l<r) {
            if(!isAlphaNumberic(toupper(s[l]))) {
                l++;
            } else if (!isAlphaNumberic(toupper(s[r]))) {
                r--;
            } else {
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