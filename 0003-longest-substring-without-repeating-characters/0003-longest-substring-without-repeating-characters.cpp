class Solution {
public:
    int lengthOfLongestSubstring(string s) {
        char set[128];
        int l = 0;
        int r = 0;
        int n = s.length();
        int ans = 0;
        for(r=0;r<n;r++) {
            char c = s[r];
            if(set[c] != 0) {
                while(s[l]!=c) {
                    set[s[l]] = 0;
                    l++;
                }
                l++;
            }
            set[c] = 1;
            ans = max(ans, r-l+1);
        }
        return ans;
    }
};