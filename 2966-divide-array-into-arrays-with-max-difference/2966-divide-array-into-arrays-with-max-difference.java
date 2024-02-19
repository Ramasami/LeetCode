class Solution {
    public int[][] divideArray(int[] nums, int k) {
        Arrays.sort(nums);
        int n=nums.length;
        int n3 = n/3;
        int[][] ans = new int[n3][3];
        for(int i=0;i<n3;i++) {
            if(nums[3*i+2]-nums[3*i]>k)
                return new int[0][0];
            ans[i]=new int[]{nums[3*i],nums[3*i+1],nums[3*i+2]};
        }
        return ans;
    }
}