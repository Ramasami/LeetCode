class Solution {
    public void rotate(int[] nums, int k) {
        int n = nums.length;
        k%=n;
        k = n-k;
        if(k==0)
            return;
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
}