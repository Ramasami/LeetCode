class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> num_set = new HashSet<>();
        int ans = 0;
        int count;
        for(int i:nums)
            num_set.add(i);
        for(int n:num_set) {
            if(!num_set.contains(n-1)) {
                count = 1;
                n++;
                while(num_set.contains(n)) {
                    count++;
                    n++;
                }
                ans=Math.max(ans,count);
            }
        }
        return ans;
    }
}