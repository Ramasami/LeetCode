class Solution {
public:
    bool isIsomorphic(string s, string t) {
        if (s.length()!=t.length())
            return false;
        int taken[128];
        int map[128];
        int n = s.length();
        for (int i=0;i<n;i++) {
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