class Solution {
    public int majorityElement(int[] nums) {
        int a = 0;
        int ca = 0;
        for(int i=0;i<nums.length;i++) {
            if(ca == 0) {
                a = nums[i];
            } 
            ca+=nums[i] == a?1:-1;
        }
        return a;
    }
}