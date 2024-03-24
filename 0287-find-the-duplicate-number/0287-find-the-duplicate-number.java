class Solution {
    public int findDuplicate(int[] nums) {
        for(int i:nums) {
            int x = Math.abs(i);
            if(nums[x]<0)
                return x;
            else
                nums[x]*=-1;
        }
        return -1;
    }
}