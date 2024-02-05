class Solution {
public:
    vector<int> intersection(vector<int>& nums1, vector<int>& nums2) {
        vector<int> vec;
        unordered_set<int> set1;
        unordered_set<int> set2;
        
        
        for(int i = 0;i<nums1.size();i++)
            set1.insert(nums1[i]);
        for(int i = 0;i<nums2.size();i++)
            set2.insert(nums2[i]);
        
        for(unordered_set<int>::iterator it = set1.begin();it!=set1.end();it++) {
            int n = *it;
            if(set2.find(n)!=set2.end())
                vec.push_back(n);
        }
        return vec;
    }
};