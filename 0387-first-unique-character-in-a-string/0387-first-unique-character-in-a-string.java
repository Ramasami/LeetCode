class Solution {
    public int firstUniqChar(String s) {
        int a[] = new int[]{-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1};
        for(int i=0;i<s.length();i++) {
            int p = s.charAt(i)-'a';
            if(a[p] == -1)
                a[p] = i;
            else
                a[p] = -2;
        }
        int min = -1;
        for(int i=0;i<26;i++) {
            if(a[i]>=0) {
                if(min == -1 || a[min] > a[i])
                    min = i;
            }
        }
        return min == -1?-1:a[min];
    }
}