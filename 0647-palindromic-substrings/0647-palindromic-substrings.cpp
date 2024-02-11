class Solution {
public:
    int countSubstrings(string s) {
        int n = s.length();
        int ans = 0;
        for(int i=0;i<n;i++) {
            int m = min(i+1,n-i);
            for(int j=0;j<m;j++) {
                if(s[i-j] == s[i+j])
                    ans++;
                else
                    break;
            }
            m = min(i+1,n-i-1);
            for(int j=0;j<m;j++) {
                if(s[i-j] == s[i+j+1])
                    ans++;
                else
                    break;
            }
        }
        return ans;
    }
};