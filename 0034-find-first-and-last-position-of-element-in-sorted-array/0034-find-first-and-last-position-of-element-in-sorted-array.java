class Solution {
    public int[] searchRange(int[] nums, int target) {
        int n = nums.length;
        int left = leftBinary(nums, n, target);
        int right = rightBinary(nums, n, target);
        return new int[]{left, right};
    }
    
    private int leftBinary(int[] nums,int n, int t) {
        int l=0;
        int r=n;
        while(l<r) {
            int m = l + (r-l)/2;
            if(nums[m]>t) {
                r = m;
            } else if(nums[m]<t) {
                l = m+1;
            } else if( m>0 && nums[m-1]==t) {
                r = m;
            } else {
                return m;
            }
        }
        return -1;
    }
    
    private int rightBinary(int[] nums,int n, int t) {
        int l=0;
        int r=n;
        while(l<r) {
            int m = l + (r-l)/2;
            if(nums[m]>t) {
                r = m;
            } else if(nums[m]<t) {
                l = m+1;
            } else if( m<n-1 && nums[m+1]==t) {
                l = m+1;
            } else {
                return m;
            }
        }
        return -1;
    }
}