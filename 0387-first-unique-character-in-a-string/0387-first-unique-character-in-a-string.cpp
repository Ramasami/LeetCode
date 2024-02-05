class Solution {
public:
    int firstUniqChar(string s) {
        long visited = 0;
        long multipleVisited = 0;
        int n = s.length();
        int p;
        int x;
        for(int i=0;i<n;i++) {
            p = s[i] - 'a';
            x = (1 << p);
            if((visited & x) == 0) {
                visited =  visited | x;
            } else {
                multipleVisited = multipleVisited | x;
            }
        }
        for(int i=0;i<n;i++) {
            int p = s[i] - 'a';
            if(((visited & (1 << p)) != 0) && ((multipleVisited & (1 << p )) == 0))
                return i;
        }
        return -1;
    }

};