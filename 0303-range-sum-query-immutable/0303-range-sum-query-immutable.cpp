class NumArray {
public:
    
    int* sums;
    
    NumArray(vector<int>& nums) {
        int sum = 0;
        int n = nums.size();
        sums = new int[n];
        for(int i=0;i<n;i++) {
            sum+=nums[i];
            sums[i] = sum;
        }
    }
    
    int sumRange(int left, int right) {
        int leftSum = left == 0?0:sums[left-1];
        return sums[right] - leftSum;
    }
   
};

/**
 * Your NumArray object will be instantiated and called as such:
 * NumArray* obj = new NumArray(nums);
 * int param_1 = obj->sumRange(left,right);
 */