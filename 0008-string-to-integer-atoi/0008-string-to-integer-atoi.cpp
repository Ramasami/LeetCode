class Solution {
public:
    int myAtoi(string s) {
        bool negative = false;
        long n = 0;
        bool nonNumberEncountered = false;
        bool firstEncountered = false;
        bool cap = false;
        for(int i=0;i<s.length();i++) {
            char c = s[i];
            if (c == ' ' && !firstEncountered && !nonNumberEncountered) continue;
            else if (c == '+' && !firstEncountered && !nonNumberEncountered) {
                nonNumberEncountered = true;
                continue;
            } else if (c == '-' && !firstEncountered && !nonNumberEncountered) {
                negative = true;
                nonNumberEncountered = true;
                continue;
            } else if (c >= '0' && c<='9') {
                firstEncountered = true;
                nonNumberEncountered = true;
                n = n*10 + c-'0';
            } else break;
            
            if ((n > INT_MAX && !negative) ||(-n < INT_MIN && negative)) {
                cap = true;
                break;
            }
        }
        
        if (cap && negative)
            return INT_MIN;
        else if (cap && !negative)
            return INT_MAX;
        else if (negative)
            return (int)-n;
        else
            return (int)n;
    }
};