class Solution {
    public int[][] merge(int[][] intervals) {
        Arrays.sort(intervals, (o1,o2) -> o1[0]-o2[0]);
        LinkedList<int[]> merged = new LinkedList<>();
        merged.add(intervals[0]);
        int n = intervals.length;
        for(int i=1;i<n;i++) {
            int[] interval = intervals[i];
            int[] end = merged.getLast();
            if (end[1] >= interval[0]) {
                merged.removeLast();
                merged.add(new int[]{end[0], Math.max(end[1], interval[1])});
            } else {
                merged.add(interval);
            }
        }
        return merged.toArray(new int[merged.size()][]);
    }
}