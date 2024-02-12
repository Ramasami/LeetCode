class Solution {
    public int maxPoints(int[][] points) {
        int n = points.length,max = 1;
        if(n==1)
            return 1;
        int x1,x2,y1,y2;
        int i,j;
        double angle;
        for(i=0;i<n;i++) {
            Map<Double, Integer> angleCounter = new HashMap<>();
             x1 = points[i][0];
             y1 = points[i][1];
            for(j=0;j<n;j++) {
                if(i==j)
                    continue;
                x2 = points[j][0];
                y2 = points[j][1];
                angle = (y1-y2)/(0.0+x1-x2);
                angleCounter.merge(angle, 1, Integer::sum);
            }
            max = Math.max(max, Collections.max(angleCounter.values()));
        }
        return max+1;
    }
}