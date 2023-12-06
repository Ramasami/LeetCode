class Solution {
public:
    int searchInsert(vector<int>& nums, int target) {
        return binarySearch(nums, target, 0, nums.size());
    }
    
    int binarySearch(vector<int>& a, int t, int l, int r) {
        int m = l + (r-l) / 2;
        if(l>=r)
            return l;
        else if(a[m]==t)
            return m;
        else if(a[m] > t)
            return binarySearch(a, t, l, m);
        else
            return binarySearch(a, t, m+1, r);
        }
    };