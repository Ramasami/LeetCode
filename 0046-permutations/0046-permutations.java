class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        int n = nums.length;
        List<Integer> numbers = new ArrayList<>(Arrays.stream(nums).boxed().collect(Collectors.toList()));
        permute(numbers,0,n,ans);
        return ans;
    }
    
    private void permute(List<Integer> numbers, int l, int r, List<List<Integer>> ans) {
        if(l == r) {
            ans.add(new ArrayList<>(numbers));
        }
        for(int i=l;i<r;i++) {
            swap(numbers,l,i);
            permute(numbers,l+1,r,ans);
            swap(numbers,l,i);
        }
    }
    
    private void swap(List<Integer> numbers, int i, int j) {
        int t = numbers.get(i);
        numbers.set(i, numbers.get(j));
        numbers.set(j, t);
    }
}