class Solution {
public:
    int thirdMax(vector<int>& nums) {
        int m1 = 0;
        int m2 = 0;
        int m3 = 0;
        bool b1 = false;
        bool b2 = false;
        bool b3 = false;
        for(vector<int>::iterator it = nums.begin();it!=nums.end();it++) {
            int n = *it;
            if((b1 && m1 == n) || (b2 && m2 == n) || (b3 && m3 == n)) {
                continue;
            } if (!b1 || n > m1) {
                m3 = m2;
                m2 = m1;
                m1 = n;
                b3 = b2;
                b2 = b1;
                b1 = true;
            } else if (!b2 || n > m2) {
                m3 = m2;
                m2 = n;
                b3 = b2;
                b2 = true;
            } else if (!b3 || n > m3) {
                m3 = n;
                b3 = true;
            }
        }
        return b3?m3:m1;
    }
};