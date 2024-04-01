class Solution {
    public int search(int[] nums, int target) {
        int pivot = findPivot(nums, 0, nums.length-1,nums.length);
        
        if(pivot!=0 && target >= nums[0] && target <=nums[pivot-1])
            return find(nums, target, 0, pivot);
        else if(target >= nums[pivot] && target <=nums[nums.length-1])
            return find(nums, target, pivot, nums.length);
        else 
            return -1;
    }
    
    private int find(int[] nums, int t, int l, int r) {
        while(l<r) {
            int m = l + (r-l)/2;
            if(nums[m]>t)
                r = m;
            else if(nums[m]<t) 
                l = m+1;
            else 
                return m;
        }
        return -1;
    }
    
    private int findPivot(int[] nums, int l, int r,int n) {
        if(l>r)
            return l;
        int m = l + (r-l)/2;
        if(nums[n-1]<nums[m]) {
            return findPivot(nums, m+1, r, n);
        } else {
            return findPivot(nums, l, m-1, n);
        }
    }
}