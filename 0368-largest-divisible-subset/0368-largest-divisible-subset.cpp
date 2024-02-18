class Solution {
public:
    vector<int> largestDivisibleSubset(vector<int>& nums) {
        int n = nums.size();
        if (n == 0) return vector<int>();

        vector<vector<int>> EDS;
        for (int num : nums) EDS.push_back(vector<int>());

        sort(nums.begin(), nums.end());

        for (int i = 0; i < n; ++i) {
          vector<int> maxSubset;

          for (int k = 0; k < i; ++k) 
            if (nums[i] % nums[k] == 0 && maxSubset.size() < EDS[k].size())
              maxSubset = EDS[k];

          for(int k:maxSubset)
            EDS[i].push_back(k);
          EDS[i].push_back(nums[i]);
        }
        vector<int> ret;
        for (int i = 0; i < n; ++i) 
          if (ret.size() < EDS[i].size()) ret = EDS[i];
        return ret;
    }
};