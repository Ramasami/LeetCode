class Solution {
    public List<List<Integer>> findMatrix(int[] nums) {
        int[] count = new int[201];
        int max = 0;
        for(int n:nums) {
            count[n]++;
            max = Math.max(max, count[n]);
        }
        List<List<Integer>> ans = new ArrayList<>();
        for(int i=0;i<max;i++)
            ans.add(new ArrayList<>());
        for(int i=1;i<=200;i++) {
            for(int j=0;j<count[i];j++)
                ans.get(j).add(i);
        }
        return ans;
    }
}