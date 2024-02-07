class Solution {
public:
    vector<int> findDisappearedNumbers(vector<int>& nums) {
        for (int i = 0; i < nums.size(); i++) {
            int newIndex = abs(nums[i]) - 1;
            if (nums[newIndex] > 0) {
                nums[newIndex] *= -1;
            }
        }
        vector<int> result;
        for (int i = 1; i <= nums.size(); i++) {
            if (nums[i - 1] > 0) {
                result.push_back(i);
            }
        }
        return result;
    }
};