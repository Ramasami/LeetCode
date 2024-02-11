class Solution {
public:
    int lengthOfLongestSubstring(string s) {
        unordered_set<char> set;
        int l = 0;
        int r = 0;
        int n = s.length();
        int ans = 0;
        for(r=0;r<n;r++) {
            char c = s[r];
            if(set.find(c) != set.end()) {
                while(s[l]!=c) {
                    set.erase(s[l]);
                    l++;
                }
                l++;
            }
            set.insert(c);
            ans = max(ans, r-l+1);
        }
        return ans;
    }
};