class Solution {
    public int[] rearrangeArray(int[] nums) {
        int l = nums.length;
        int p=0,n=0;
        int[] ans = new int[l];
        for(int i=0;i<l;i++) {
            if(nums[i]>0) {
                ans[2*p]=nums[i];
                p++;
            }
            else{
                ans[2*n+1]=nums[i];
                n++;
            }
        }
        return ans;
    }
}