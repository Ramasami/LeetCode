class Solution {
    public int majorityElement(int[] nums) {
        int a = 0;
        int ca = 0;
        for(int n:nums) {
            if(ca == 0) a = n;
            ca+=n == a?1:-1;
        }
        return a;
    }
}