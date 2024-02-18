class Solution {
public:
    char findTheDifference(string s, string t) {
        int n = 0;
        
        int l1 = s.length();
        for(int i=0;i<l1;i++) {
            n = n ^ (1<<(s[i]-'a'));
        }
        
        for(int i=0;i<=l1;i++) {
            n = n ^ (1<<(t[i]-'a'));
        }
        for(int i=0;i<26;i++) {
            if ((n ^ (1 << i)) == 0)
                return (char)(i+'a');
        }
        return 'a';
    }
};