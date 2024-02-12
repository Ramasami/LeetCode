class Solution {
    public int maxPoints(int[][] points) {
        int n = points.length,max = 1;
        int x1,x2,y1,y2;
        double angle;
        for(int i=0;i<n;i++) {
            Map<Double, Integer> angleCounter = new HashMap<>();
             x1 = points[i][0];
             y1 = points[i][1];
            for(int j=0;j<n;j++) {
                if(i==j)
                    continue;
                x2 = points[j][0];
                y2 = points[j][1];
                angle = (y1-y2)/(0.0+x1-x2);
                angleCounter.compute(angle, (k,v)->v==null?2:v+1);
            }
            for(int count: angleCounter.values())
                max = Math.max(max, count);
        }
        return max;
    }
}