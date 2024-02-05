class Solution {
public:
    bool containsNearbyDuplicate(vector<int>& nums, int k) {
        unordered_set<int> set;
        int i=0;
        for(vector<int>::iterator it = nums.begin();it!=nums.end();it++,i++) {
            if (set.find(*it) != set.end())
                return true;
            set.insert(*it);
            if(i>k-1)
                set.erase(nums[i-k]);
        }
        return false;
    }
};