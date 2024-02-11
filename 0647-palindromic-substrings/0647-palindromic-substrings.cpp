class Solution {
public:
    int countSubstrings(string s) {
        int n = s.length();
        int ans = 0;
        for(int i=0;i<n;i++) {
            bool sing = true;
            bool doub = true;
            for(int j=0;j<n;j++) {
                
                if(sing && i-j>=0 && i+j<n && s[i-j] == s[i+j])
                    ans++;
                else
                    sing = false;
                if(doub && i-j>=0 && i+j+1<n && s[i-j] == s[i+j+1])
                    ans++;
                else
                    doub = false;
                if(!sing && !doub)
                    break;
            }
        }
        return ans;
    }
};