class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        int n = nums.length;
        permute(nums,0,n,ans);
        return ans;
    }
    
    private void permute(int[] nums, int l, int r, List<List<Integer>> ans) {
        if(l == r) {
            ans.add(Arrays.stream(nums).boxed().collect(Collectors.toList()));
        }
        for(int i=l;i<r;i++) {
            swap(nums,l,i);
            permute(nums,l+1,r,ans);
            swap(nums,l,i);
        }
    }
    
    private void swap(int[] nums, int i, int j) {
        int t = nums[i];
        nums[i] = nums[j];
        nums[j] = t;
    }
}