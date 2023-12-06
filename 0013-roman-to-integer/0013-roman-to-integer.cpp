class Solution {
public:
    int romanToInt(string s) {
        int ans = 0;
        char prev = 0;
        for (int i=0;i<s.length();i++) {
            switch (s[i]) {
                case 'M': {
                    if (prev == 'C')
                        ans+=900 - 100;
                    else
                        ans+=1000;
                    break;
                    }
                case 'D': {
                    if (prev == 'C')
                        ans+=400 - 100;
                    else
                        ans+=500;
                    break;
                    }
                case 'C': {
                    if (prev == 'X')
                        ans+=90 - 10;
                    else
                        ans+=100;
                    break;
                    }
                case 'L': {
                    if (prev == 'X')
                        ans+=40 -10;
                    else
                        ans+=50;
                    break;
                    }
                case 'X': {
                    if (prev == 'I')
                        ans+=9 - 1;
                    else
                        ans+=10;
                    break;
                    }
                case 'V': {
                    if (prev == 'I')
                        ans+=4 - 1;
                    else
                        ans+=5;
                    break;
                    }
                case 'I': {
                    {
                        ans+=1;
                    break;
                    }
                }
            }
            prev = s[i];
        }
        return ans;
    }
};