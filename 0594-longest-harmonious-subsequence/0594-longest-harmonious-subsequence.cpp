class Solution {
public:
    int findLHS(vector<int>& nums) {
        unordered_map<int,int> map;
        int res = 0;
        for (int num: nums) {
            if(map.count(num)==0)map[num]=0;
            map[num]++;
            if (map.count(num + 1))
                res = max(res, map[num] + map[num + 1]);
            if (map.count(num - 1))
                res = max(res, map[num] + map[num - 1]);
        }
        return res;
    }
};