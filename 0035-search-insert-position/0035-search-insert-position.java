class Solution {
    public int searchInsert(int[] nums, int target) {
        return binarySearch(0,nums.length,nums, target);
    }
    
    private int binarySearch(int l,int r, int[] nums, int target) {
        if(l>=r)
            return l;
        int m = l + (r-l)/2;
        if(nums[m] == target)
            return m;
        else if(nums[m] > target)
            return binarySearch(l,m,nums,target);
        else
            return binarySearch(m+1,r,nums,target);
    }
}