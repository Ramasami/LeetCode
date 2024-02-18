class Solution {
public:
    vector<vector<int>> removeInterval(vector<vector<int>>& intervals, vector<int>& toBeRemoved) {
        vector<vector<int>> result;
        for (vector<int> interval : intervals) {
            if (interval[0] > toBeRemoved[1] || interval[1] < toBeRemoved[0]) {
                result.push_back(vector<int>{interval[0], interval[1]});
            } else {
                if (interval[0] < toBeRemoved[0]) {
                    result.push_back(vector<int>{interval[0], toBeRemoved[0]});
                }
                if (interval[1] > toBeRemoved[1]) {
                    result.push_back(vector<int>{toBeRemoved[1], interval[1]});
                }
            }
        }
        return result;
    }
};