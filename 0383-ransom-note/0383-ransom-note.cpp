class Solution {
public:
    bool canConstruct(string ransomNote, string magazine) {
        int m[26];
        int n = magazine.length();
        for(int i=0;i<n;i++) {
            m[magazine[i]-'a']++;
        }
        n = ransomNote.length();
        for(int i=0;i<n;i++) {
            if(--m[ransomNote[i]-'a'] < 0)
                return false;
        }
        return true;
    }
};