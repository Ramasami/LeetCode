class Solution {
public:
    int longestConsecutive(vector<int>& nums) {
        unordered_set<int> num_set;
        int ans = 0;
        int n;
        int count;
        for(vector<int>::iterator it = nums.begin();it!=nums.end();it++)
            num_set.insert(*it);
        for(unordered_set<int>::iterator it = num_set.begin();it!=num_set.end();it++) {
            n = *it;
            if(num_set.count(n-1)==0) {
                count = 1;
                n++;
                while(num_set.count(n)==1) {
                    count++;
                    n++;
                }
                ans=max(ans,count);
            }
        }
        return ans;
    }
};