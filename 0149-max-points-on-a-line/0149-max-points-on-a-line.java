class Solution {
    public int maxPoints(int[][] points) {
        int n = points.length;
        int max = 1;
        for(int i=0;i<n;i++) {
            Map<Double, Integer> angleCounter = new HashMap<>();
            int x1 = points[i][0];
            int y1 = points[i][1];
            for(int j=0;j<n;j++) {
                if(i==j)
                    continue;
                int x2 = points[j][0];
                int y2 = points[j][1];
                double angle =(y1-y2)/(0.0+x1-x2);
                angleCounter.compute(angle, (k,v)->v==null?2:v+1);
            }
            for(int count: angleCounter.values())
                max = Math.max(max, count);
        }
        return max;
    }
}