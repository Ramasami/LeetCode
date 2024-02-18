class Solution {
    public List<String> summaryRanges(int[] nums) {
        int l=0,r=0;
        int n = nums.length;
        List<String> ans = new ArrayList<>();
        while(r<n) {
            if(r == n-1 || nums[r]+1 != nums[r+1]) {
               check(l,r,nums,ans);
                l = r+1;
            }
            r++;
        }
        return ans;
    }
    void check(int l,int r, int[] nums, List<String> ans) {
        if(l==r)
            ans.add(String.valueOf(nums[l]));
        else
            ans.add(String.valueOf(nums[l])+"->"+String.valueOf(nums[r]));
    }
}