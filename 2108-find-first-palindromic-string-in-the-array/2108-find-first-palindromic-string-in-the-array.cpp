class Solution {
public:
    string firstPalindrome(vector<string>& words) {
        int i,n;
        string word;
        for(vector<string>::iterator it = words.begin();it!=words.end();it++) {
            word = *it;
            int n = word.length();
            for(i=0;i<n/2;i++) {
                if(word[i]!=word[n-i-1])
                    break;
            }
            if(i==n/2)
                return word;
        }
        return "";
    }
};