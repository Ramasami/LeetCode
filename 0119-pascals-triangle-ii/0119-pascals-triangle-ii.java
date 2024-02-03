class Solution {
    public List<Integer> getRow(int rowIndex) {
        List<Integer> result = List.of(1);
        while(rowIndex>0) {
            result = getNext(result);
            rowIndex--;   
        }
        return result;
    }
    
    private List<Integer> getNext(List<Integer> previous) {
        int n = previous.size();
        List<Integer> current = new ArrayList<>(n+1);
        current.add(1);
        for(int i=0;i<n-1;i++) 
            current.add(previous.get(i) + previous.get(i+1));
        current.add(1);
        return current;
    }
}