class Solution {
public:
    int majorityElement(vector<int>& nums) {
        int c1=0,c2=0,a1,a2;
        for (vector<int>::iterator it=nums.begin();it!=nums.end();it++) {
            if (c1==0) {
                c1++;
                a1=*it;
            } else if (c2==0) {
                c2++;
                a2=*it;
            } else if (a1==*it) {
                c1++;   
            } else if (a2==*it) {
                c2++;
            } else {
                c1--;
                c2--;
            }
        }
        
        c1=0;
        c2=0;
        for (vector<int>::iterator it=nums.begin();it!=nums.end();it++) {
            if (a1==*it) {
                c1++;   
            } else if (a2==*it) {
                c2++;
            }
        }
        
        return c1>c2?a1:a2;
    }
};