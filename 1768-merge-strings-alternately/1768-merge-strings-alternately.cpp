class Solution {
public:
    string mergeAlternately(string word1, string word2) {
        int n = word1.length();
        int m = word2.length();
        int i = 0;
        string s;
        while(i<n && i<m) {
            s+=word1[i];
            s+=word2[i];
            i++;
        }
        s+=word1.substr(i, n-i);
        s+=word2.substr(i, m-i);
        return s;
    }
};