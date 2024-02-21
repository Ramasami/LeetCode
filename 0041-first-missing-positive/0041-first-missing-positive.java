class Solution {
    public int firstMissingPositive(int[] nums) {
        int c = 10002;
        int n = nums.length;
        for(int i=0;i<n;i++)
            if(nums[i] == 0)
                nums[i] = c;
        for(int i=0;i<n;i++) {
            int t = nums[i];
            while(true) {
                if(t<=n && t > 0) {
                    int t2 = nums[t-1];
                    nums[t-1] = 0;
                    t = t2;
                } else break;
            }
        }
        for(int i=0;i<n;i++)
            if(nums[i]!=0)
                return i+1;
        return n+1;
    }
}