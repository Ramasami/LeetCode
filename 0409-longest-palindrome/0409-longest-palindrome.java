class Solution {
    public int longestPalindrome(String s) {
        int a[] = new int[52];
        for(char c:s.toCharArray()) {
            if(c>='a') {
                a[c-'a']++;
            } else {
                a[c-'A'+26]++;
            }
        }
        int sum = 0;
        boolean odd = false;
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
}