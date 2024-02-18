class Solution {
    public int thirdMax(int[] nums) {
        int m1 = 0;
        int m2 = 0;
        int m3 = 0;
        boolean b1 = false;
        boolean b2 = false;
        boolean b3 = false;
        for(int n: nums) {
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
}