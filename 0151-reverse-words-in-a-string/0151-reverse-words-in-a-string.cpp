class Solution {
public:
    string reverseWords(string s) {
        int l = 0;
        int r = s.length()-1;
        string sb;
        while(s[l]==' ') l++;
        while(s[r]==' ') r--;
        while(l<=r) {
            if(s[r] != ' ' || s[r-1] != ' ') {
                sb+=s[r];
            }
            r--;
        }
        l = 0;
        for(r=0;r<=sb.length();r++) {
            if(r == sb.length() || sb[r] == ' ') {
                std::reverse(sb.begin()+l,sb.begin()+r);
                l = r+1;
            }
        }
        return sb;
    }
    
};