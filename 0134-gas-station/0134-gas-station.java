class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int l = 0;
        int r = 0;
        int k = 0;
        int tank = 0;
        int n = gas.length;
        while(l < n) {
            tank+=gas[r]-cost[r];
            while(l<=k && l<n && tank<0) {
                tank-=(gas[l]-cost[l]);
                l++;
            }
            r++;
            k++;
            r%=n;
            if (k-l == n)
                return l;
        }
        return -1;
    }
}