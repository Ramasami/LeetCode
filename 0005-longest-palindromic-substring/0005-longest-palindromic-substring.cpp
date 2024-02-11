class Solution
{
public:
    string longestPalindrome(string s)
    {
        int n = s.length();
        int l = 0;
        int r = 0;
        int m = 1;
        for (int i = 0; i < n; i++)
        {
            for (int j = 1; i + j <= n && i - j >= -1; j++)
            {
                if (i - j == -1 || i + j == n || s[i + j] != s[i - j]) 
                {
                    if (2 * j - 1 > m)
                    {
                        m = 2 * j - 1;
                        r = i + j - 1;
                        l = i - j + 1;
                    }
                    break;
                }
            }
            if (i < n - 1 && s[i] == s[i + 1])
            {
                for (int j = 1; i + j <= n && i - j >= -1; j++)
                {
                    if (i - j == -1 || i + j + 1 == n || s[i + j + 1] != s[i - j])
                    {
                        if (2 * j > m)
                        {
                            m = 2 * j;
                            r = i + j;
                            l = i - j + 1;
                        }
                        break;
                    }
                }
            }
        }
        return s.substr(l, r-l+1);
    }
};