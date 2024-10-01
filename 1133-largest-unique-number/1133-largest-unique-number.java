class Solution {
    public int largestUniqueNumber(int[] nums) {
        int[] c = new int[1001];
        for(int i: nums) {
            c[i]++;
        }
        for(int i=1000;i>=0;i--) {
            if(c[i]==1)
                return i;
        }
        return -1;
    }
}