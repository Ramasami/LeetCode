class Solution {
public:
    int firstUniqChar(string s) {
        long visited = 0;
        long multipleVisited = 0;
        int n = s.length();
        for(int i=0;i<n;i++) {
            int p = s[i] - 'a';
            if((visited & (1 << p)) == 0) {
                visited =  visited | (1 << p);
            } else {
                multipleVisited = multipleVisited | (1 << p);
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