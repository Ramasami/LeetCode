class Solution {
    public int compareVersion(String version1, String version2) {
        return check(version1, 0, version1.length(), version2, 0, version2.length());
    }
    
    private int check(String version1, int x, int n, String version2, int y, int m) {
        if (x == n && y == m)
            return 0;
        int a = 0, b = 0;
        while(x < n && version1.charAt(x)!='.') {
            a*=10;
            a+=(version1.charAt(x)-'0');
            x++;
        }
        x = x == n?x:x+1;
        while(y < m && version2.charAt(y)!='.') {
            b*=10;
            b+=(version2.charAt(y)-'0');
            y++;
        }
        y = y == m?y:y+1;
        if(a == b)
            return check(version1, x, n, version2, y, m);
        return a>b?1:-1;
    }
}