// The API isBadVersion is defined for you.
// bool isBadVersion(int version);

class Solution {
public:
    int firstBadVersion(int n) {
        
        int l = 0;
        int r = n;
        int curr = 0;
        while (l<r) {
            int m = l + (r-l)/2;
            bool isBad = isBadVersion(m + 1);
            if (isBad) {
                curr = m;
                r = m;
            } else {
                l = m+1;                
            }
        }
        return curr + 1;
    }
};