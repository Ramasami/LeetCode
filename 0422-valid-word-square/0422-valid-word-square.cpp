class Solution {
public:
    bool validWordSquare(vector<string>& words) {
        int l = words.size();
        for(int i=0;i<l;i++) {
            for(int j=0;j<words[i].length();j++) {
                if (j >= words.size() || j >= words[i].length() || i >= words[j].length()) {
                    return false;
                }
                if (words[i][j] != words[j][i]) {
                    return false;
                }
            }
        }
        return true;
    }
};