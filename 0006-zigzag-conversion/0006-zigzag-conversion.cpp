class Solution {
public:
    string convert(string s, int numRows) {
        int n = s.length();
        if (n == 1 || numRows == 1)
            return s;
        int next = (2*(numRows-1));
        string sb;
        
        for(int i=0;i*next<n;i++)
            sb+=s[i*next];
        
        for (int i=1;i<numRows-1;i++) {
            int mid = (numRows-i)*2-2;
            for(int k = 0;i+k*next<n;k++) {
                sb+=s[i+k*next];
                if(i+k*next+mid<n)
                    sb+=s[i+k*next+mid];
            }
        }
        for(int i=0;numRows -1 + i*next<n;i++)
            sb+=s[i*next-1+numRows];
        return sb;
    }
};