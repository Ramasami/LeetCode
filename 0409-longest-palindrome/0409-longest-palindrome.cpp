class Solution {
public:
    int longestPalindrome(string s) {
        int a[52];
        int n = s.length();
        int c;
        for(int i=0;i<n;i++) {
            c = s[i];
            if(c>='a') {
                a[c-'a']++;
            } else {
                a[c-'A'+26]++;
            }
        }
        int sum = 0;
        bool odd = false;
        for(int i=0;i<52;i++) {
            if(a[i] % 2 == 0) {
                sum+=a[i];
            } else {
                odd = true;
                sum+=a[i]-1;
            }
        }
        if(odd)
            sum++;
        return sum;
    }
};