class Solution {
public:
    string convertToTitle(int columnNumber) {
        string ans;
        while(true) {
            columnNumber--;
            ans+=(((char)('A' + (columnNumber%26))));
            columnNumber/=26;
            if (columnNumber == 0) {
                reverse(ans.begin(),ans.end());
                return ans;
            }
        }
    }
};