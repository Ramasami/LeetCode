class Solution {
public:
    bool isIsomorphic(string s, string t) {
        if (s.length()!=t.length())
            return false;
        int taken[257];
        int map[257];
        for (int i=0;i<s.length();i++) {
            int y = t[i] + 1;
            int x = s[i] + 1;
            if (taken[y] == 0 && map[x] == 0) {
                taken[y] = 1;
                map[x] = y;
            } else if (map[x] != y)
                return false;
           
            
        }
        return true;
    }
};