class Solution {
public:
    vector<string> fullJustify(vector<string>& words, int maxWidth) {
        vector<string> ans;
        int n = words.size();
        int l = 0;
        int r = 1;
        int length = words[0].length();
        while(r<n) {
            if (length + 1 + words[r].length() <= maxWidth) {
                length += 1 + words[r].length();
            } else {
                ans.push_back(generate(l,r-1,words, length, maxWidth, false));
                l = r;
                length=words[r].length();
            }
            r++; 
        }
        ans.push_back(generate(l,r-1,words, length,maxWidth,true ));
        return ans;
    }
    
    string generate(int l, int r, vector<string>& words, int length, int maxWidth, bool left) {
        string sb;
        if (r==l || left) {
            for(int i=l;i<r;i++) {
                sb+=words[i];
                sb+=" ";
            }
            sb+=words[r];
            addSpaces(sb, maxWidth - sb.length());
        } else {
            int n = r-l+1;
            int lenWOSpace = length - (n - 1);
            int spaces = maxWidth - lenWOSpace;
            int numOfSpaces = spaces / (n-1);
            int j=0;
            int i=l;
            int x = spaces%(n-1);
            for(;i<r && j<x;j++,i++) {
                sb+=words[i];
                addSpaces(sb, numOfSpaces+1);
            }
            for(;i<r;i++) {
                sb+=words[i];
                addSpaces(sb, numOfSpaces);
            }
            sb+=words[r];
        }
        
        
        return sb;
    }
    
    void addSpaces(string &sb, int n) {
        for(int i=0;i<n;i++)
            sb+=" ";
    }
};