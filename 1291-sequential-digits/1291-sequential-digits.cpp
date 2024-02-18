class Solution {
public:
    vector<int> sequentialDigits(int low, int high) {
        int lowSize = getLen(low);
        int highSize = getLen(high);
        vector<int> ans;
        
        int n = 0;
        
        for(int i=1;i<10;i++) {
            n = i;
            int last = i;
            for(int j=0;j<highSize;j++) {
                if(last == 9)
                    break;
                n=n*10+(++last);
                if (n>=low && n<=high) {
                    ans.push_back(n);
                }
            }
        }
        sort(ans.begin(), ans.end());
        return ans;
    }
    
    int getLen(int num) {
        int cur = num;
        int ret = 0;

        while (cur > 0) {
            cur = cur / 10;
            ret++;
        }
        
        return ret;
    }
};