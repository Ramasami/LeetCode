class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> previous = List.of(1);
        result.add(previous);
        while(numRows>1) {
            previous = generateNext(previous);
            result.add(previous);
            numRows--;
        }
        return result;
    }
    
    private List<Integer> generateNext(List<Integer> previous) {
        int n = previous.size();
        List<Integer> ans = new ArrayList(n+1);
        ans.add(1);
        for(int i=0;i<n-1;i++)
            ans.add(previous.get(i) + previous.get(i+1));
        ans.add(1);
        return ans;
    }
}