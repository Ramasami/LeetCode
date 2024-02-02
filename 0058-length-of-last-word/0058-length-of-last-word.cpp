class Solution {
public:
    int lengthOfLastWord(string s) {
        int lastSize = 0;
        int currSize = 0;
        for(int i=0;i<s.length();i++) {
            if(s[i] == ' ' && currSize > 0) {
                lastSize = currSize;
                currSize = 0;
            } else if(s[i]!= ' ') {
               currSize++; 
            }
        }
        return currSize>0?currSize:lastSize;
    }
};