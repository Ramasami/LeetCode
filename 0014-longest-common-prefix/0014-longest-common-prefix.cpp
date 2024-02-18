class Solution {
public:
    string longestCommonPrefix(vector<string>& strs) {
        string s = strs[0];
        for(int i=0;i<s.length();i++) {
            for(int j=1;j<strs.size();j++) {
                if (i >= strs[j].length() || strs[j][i] !=s[i]) {
                    return s.substr(0,i);
                }
            }
        }
        return s;
    }
};