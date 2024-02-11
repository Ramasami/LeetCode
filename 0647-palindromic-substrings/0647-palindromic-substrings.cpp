class Solution {
public:
    int countSubstrings(string s) {
        int n = s.length();
        int ans = 0;
        for(int i=0;i<n;i++) {
            bool sing = true;
            bool doub = true;
            int m = min(i+1,n-i+1);
            for(int j=0;j<m;j++) {
                
                if(sing && s[i-j] == s[i+j])
                    ans++;
                else
                    sing = false;
                if(doub && s[i-j] == s[i+j+1])
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