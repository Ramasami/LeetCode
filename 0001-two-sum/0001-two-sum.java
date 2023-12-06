class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer,Integer> s = new HashMap<>();
        for(int i=0;i<nums.length;i++) {
            int n = nums[i];
            if (s.containsKey(target-n))
                return new int[]{i,s.get(target-n)};
            s.put(n,i);
        }
        return null;
    }
}