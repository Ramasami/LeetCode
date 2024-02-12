class Solution {
public:
    int maxPoints(vector<vector<int>>& points) {
        int n = points.size(),ans = 1;
        if(n==1)
            return 1;
        int x1,x2,y1,y2;
        int i,j;
        double angle;
        for(i=0;i<n;i++) {
            unordered_map<double, int> angleCounter;
             x1 = points[i][0];
             y1 = points[i][1];
            for(j=0;j<n;j++) {
                if(i==j)
                    continue;
                x2 = points[j][0];
                y2 = points[j][1];
                angle = (y1-y2)/(0.0+x1-x2);
                if(angleCounter.count(angle)==0)
                    angleCounter[angle]=2;
                else
                    angleCounter[angle]++;
            }
            for(unordered_map<double, int>::iterator it = angleCounter.begin();it!=angleCounter.end();it++) {
                ans = max(ans, it->second);
            }
            
        }
        return ans;
    }
};