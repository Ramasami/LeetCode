class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        int m[] = new int[26];
        int n = magazine.length();
        for(int i=0;i<n;i++) {
            m[magazine.charAt(i)-'a']++;
        }
        n = ransomNote.length();
        for(int i=0;i<n;i++) {
            if(--m[ransomNote.charAt(i)-'a'] < 0)
                return false;
        }
        return true;
    }
}