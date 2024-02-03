class Solution {
    public int majorityElement(int[] nums) {
        int a = 0;
        int b = 0;
        int ca = 0;
        int cb = 0;
        for(int i=0;i<nums.length;i++) {
            if(cb == 0) {
                b = nums[i];
                cb = 1;
            } else if(ca == 0) {
                a = nums[i];
                ca = 1;
            } else if (b == nums[i]) {
                cb++;   
            } else if (a == nums[i]) {
                ca++;
            } else {
                cb--;
                ca--;
            }
        }
        if(ca==0)
            return b;
        ca = 0;
        cb = 0;
        for(int i=0;i<nums.length;i++) {
            if (a==nums[i])   
                ca++;
            else if(b == nums[i])
                cb++;
        }
        return ca>cb?a:b;
    }
}