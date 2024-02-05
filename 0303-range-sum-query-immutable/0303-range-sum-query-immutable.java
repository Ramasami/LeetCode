class NumArray {
    
    private int[] sums;

    public NumArray(int[] nums) {
        int sum = 0;
        int n = nums.length;
        sums = new int[n];
        for(int i=0;i<n;i++) {
            sum+=nums[i];
            sums[i] = sum;
        }
    }
    
    public int sumRange(int left, int right) {
        int leftSum = left == 0?0:sums[left-1];
        return sums[right] - leftSum;
    }
}

/**
 * Your NumArray object will be instantiated and called as such:
 * NumArray obj = new NumArray(nums);
 * int param_1 = obj.sumRange(left,right);
 */