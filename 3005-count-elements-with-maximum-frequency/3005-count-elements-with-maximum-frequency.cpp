class Solution {
public:
    int maxFrequencyElements(vector<int>& nums) {
        int n = nums.size();
        int a[101];
        for(int i=0;i<101;i++)
            a[i]=0;
        for(int i=0;i<n;i++) {
            a[nums[i]]++;
        }
        int max = 0;
        int maxCount=0;
        for(int i=0;i<101;i++) {
            if(a[i]>max) {
                max = a[i];
                maxCount = max;
            } else if(a[i]==max) {
                maxCount+=max;
            }
        }
        return maxCount;
    }
};