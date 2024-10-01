class Solution {
    public int largestUniqueNumber(int[] nums) {
        Map<Integer, Integer> c = new TreeMap<>((o1,o2)->o2-o1);
        for(int i: nums) {
            c.compute(i, (k, v) -> {
                if(v==null) v=0;
                return v+1;
            });
        }
        for(Map.Entry<Integer,Integer> x: c.entrySet()) {
            if(x.getValue() == 1) {
                return x.getKey();
            }
        }
        return -1;
    }
}