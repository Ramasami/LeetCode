class Solution {
public:
    vector<int> intersection(vector<int>& nums1, vector<int>& nums2) {
        vector<int> vec;
        unordered_set<int> set1;
        
        
        for(int i = 0;i<nums1.size();i++)
            set1.insert(nums1[i]);
        
        for(vector<int>::iterator it = nums2.begin();it!=nums2.end();it++) {
            int n = *it;
            if(set1.find(n)!=set1.end()) {
                set1.erase(n);
                vec.push_back(n);
            }
        }
        return vec;
    }
};