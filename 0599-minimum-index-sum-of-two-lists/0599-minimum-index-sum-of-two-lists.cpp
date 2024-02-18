class Solution {
public:
    vector<string> findRestaurant(vector<string>& list1, vector<string>& list2) {
        int i=0, count = 0,min = INT_MAX;
        vector<string> *ans = new vector<string>();
        unordered_map<string, int> map;
        vector<string> m = list1.size() < list2.size() ? list1 : list2;
        vector<string> list = list1.size() >= list2.size() ? list1 : list2;
        for(string s:m) {
            if(map.count(s) == 0)
                map[s]=i;
            i++;
        }
        i=0;
        for(string s:list) {
            if(map.count(s) == 1) {
                count = i + map[s];
                if(count < min) {
                    min = count;
                    ans = new vector<string>();
                }
                if(count == min)
                    ans->push_back(s);
            }
            i++;
        }
        return *ans;
    }
};