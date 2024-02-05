class Solution {
public:
    bool containsDuplicate(vector<int>& nums) {
        unordered_set<int> s;
        for(vector<int>::iterator it = nums.begin();it!=nums.end();it++) {
            if (s.find(*it)!=s.end())
                return true;
            s.insert(*it);
        }
        return false;
    }
};