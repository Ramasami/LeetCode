class Solution {
    public boolean isIsomorphic(String s, String t) {
        if (s.length()!=t.length())
            return false;
        int[] taken = new int[257];
        int[] map = new int[257];
        for (int i=0;i<s.length();i++) {
            Integer y = t.charAt(i) + 1;
            Integer x = s.charAt(i) + 1;
            if (taken[y] == 0 && map[x] == 0) {
                taken[y] = 1;
                map[x] = y;
            } else if (map[x] != y)
                return false;
           
            
        }
        return true;
    }
}