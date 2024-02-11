class Solution {
    public int myAtoi(String s) {
        boolean negative = false;
        long n = 0;
        boolean nonNumberEncountered = false;
        boolean firstEncountered = false;
        boolean cap = false;
        for(int i=0;i<s.length();i++) {
            char c = s.charAt(i);
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
            
            if ((n > Integer.MAX_VALUE && !negative) ||(-n < Integer.MIN_VALUE && negative)) {
                cap = true;
                break;
            }
        }
        
        if (cap && negative)
            return Integer.MIN_VALUE;
        else if (cap && !negative)
            return Integer.MAX_VALUE;
        else if (negative)
            return (int)-n;
        else
            return (int)n;
    }
}