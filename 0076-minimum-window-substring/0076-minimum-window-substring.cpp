class Solution {
public:
    string minWindow(string t, string s) {
        unordered_map<char, int> map;
        int l=0,r=0,n=t.length();
        for(char c:s) {
            if(map.count(c) == 0)
                map[c] = 0;
            map[c]++;
        }
        int charLeft = map.size();
        int minL=0,minR=INT_MAX;
        while(r<n) {
            char cr = t[r];
            if(map.count(cr)==1) {
                if(map[cr]==1)
                    charLeft--;
                map[cr]--;
                if (charLeft==0) {
                    while(l<r) {
                        char cl = t[l];
                        if(map.count(cl) == 1) {
                            if(map[cl]==0)
                                break;
                            map[cl]++;
                        } 
                        l++;
                    }
                    if(minR-minL > r-l) {
                        minR = r;
                        minL = l;
                    }
                }
            } 
            r++;
        }
        if(minR == INT_MAX)
            return "";
        else
            return t.substr(minL,minR-minL+1);
    }
};