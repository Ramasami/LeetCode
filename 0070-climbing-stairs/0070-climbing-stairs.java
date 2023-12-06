class Solution {
    public int climbStairs(int n) {
        int a2 = 0, a1 = 1;
        for (int i = 0;i<n;i++) {
            int b = a2 + a1;
            a2 = a1;
            a1 = b;
        }
        return a1;
    }
}