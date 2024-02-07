class Solution {
public:
    vector<vector<string>> groupAnagrams(vector<string>& strs) {
        unordered_map<string, vector<string>> m;
        int n = strs.size();
        for(int i=0;i<n;i++) {
            string s = strs[i];
            string sorteds = strs[i];
            sort(sorteds.begin(), sorteds.end());
            unordered_map<string, vector<string>>::iterator it =  m.find(sorteds);
            if(it == m.end()) 
                m[sorteds]= vector<string>();
            m[sorteds].push_back(s);
        }
        vector<vector<string>> result;
        for(unordered_map<string, vector<string>>::iterator it = m.begin();it!=m.end();it++) {
            result.push_back(it->second);
        }
        return result;
    }
};