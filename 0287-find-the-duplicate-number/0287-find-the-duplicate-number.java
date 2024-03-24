class Solution {
    public int findDuplicate(int[] nums) {
        int ans = -1;
        for(int i:nums) {
            int x = Math.abs(i);
            if(nums[x]<0) {
                ans = x;
                break;
            }
            else
                nums[x]*=-1;
        }
        for (int i = 0; i < nums.length; i++)
            nums[i] = Math.abs(nums[i]);
        return ans;
    }
}