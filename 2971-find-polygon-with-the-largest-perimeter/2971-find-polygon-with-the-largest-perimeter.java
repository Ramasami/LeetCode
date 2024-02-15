class Solution {
    public long largestPerimeter(int[] nums) {
        long ans = -1;
        long sum = 0;
        int n = nums.length;
        Arrays.sort(nums);
        for(int i=0;i<n;i++) {
            if(sum>nums[i])
                ans = sum + nums[i];
            sum+=nums[i];
        }
        return ans;
    }
}