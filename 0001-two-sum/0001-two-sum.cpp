class Solution {
public:
    vector<int> twoSum(vector<int>& nums, int target) {
        unordered_map<int,int> map;
        for(int i=0;i<nums.size();i++) {
            unordered_map<int,int>::iterator rem = map.find(target-nums[i]);
            if (rem == map.end()) {
                map[nums[i]]=i;
            } 
            else {
                vector<int> ans = vector<int>(2);
                ans[0] = rem->second;
                ans[1] = i;
                return ans;
            }
          
        }
        return vector<int>(0);
    }
};