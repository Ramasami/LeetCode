class Solution {
public:
    void rotate(vector<int>& nums, int k) {
        int n = nums.size();
        k%=n;
        k = n-k;
        int count = 0;
        for(int i=0;count<n;i++) {
            int curr = nums[i];
            int j = i;
            while(true) {
                int nextJ = (j+k)%n;
                count++;
                if(nextJ == i) {
                    nums[j] = curr; 
                    break;
                }
                nums[j] = nums[nextJ];
                j = nextJ;
            }
        }
    }

};