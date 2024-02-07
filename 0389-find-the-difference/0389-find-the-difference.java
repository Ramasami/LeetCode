class Solution {
    public char findTheDifference(String s, String t) {
        int n = 0;
        
        int l1 = s.length();
        for(int i=0;i<l1;i++) {
            n = n ^ (1<<(s.charAt(i)-'a'));
        }
        
        for(int i=0;i<=l1;i++) {
            n = n ^ (1<<(t.charAt(i)-'a'));
        }
        for(int i=0;i<26;i++) {
            if ((n ^ (1 << i)) == 0)
                return (char)(i+'a');
        }
        return 'a';
    }
}