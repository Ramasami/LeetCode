class Solution {
    public boolean canPermutePalindrome(String s) {
        int c[] = new int[26];
        for (int i=0;i<s.length();i++)
            c[s.charAt(i)-'a']++;
        boolean single = false;
        for (int i=0;i<26;i++)
            if(c[i]%2!=0 && !single)
                single=!single;
            else if(c[i]%2!=0)
                return false;
        return true;
    }
}