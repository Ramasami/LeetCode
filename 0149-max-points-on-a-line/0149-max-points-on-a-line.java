class Solution {
    public int maxPoints(int[][] points) {
        int n = points.length;
        int max = 1;
        for(int i=0;i<n;i++) {
            Map<Double, Integer> angleCounter = new HashMap<>();
            int x1 = points[i][0];
            int y1 = points[i][1];
            int xAxis = 1;
            for(int j=0;j<n;j++) {
                if(i==j)
                    continue;
                int x2 = points[j][0];
                int y2 = points[j][1];
                if(x1==x2) {
                    xAxis++;
                    System.out.println("("+x1+","+y1+"),("+x2+","+y2+") -> inf");
                }
                else {
                    double angle =(y1-y2)/(0.0+x1-x2);
                    System.out.println("("+x1+","+y1+"),("+x2+","+y2+") -> " + angle);
                    angleCounter.compute(angle, (k,v)->v==null?2:v+1);
                }
            }
            System.out.println();
            for(int count: angleCounter.values())
                xAxis = Math.max(xAxis, count);
            max = Math.max(max, xAxis);
        }
        System.out.println();
        return max;
    }
}