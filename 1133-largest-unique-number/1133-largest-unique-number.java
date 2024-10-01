class Solution {
    public int largestUniqueNumber(int[] nums) {
        PriorityQueue<Integer> pq = new PriorityQueue((o1,o2)->((int)o2-(int)o1));
        int[] v = new int[1001];
        int[] nv = new int[1001];
        for(int i: nums) {
            if(v[i]==0) {
                if(nv[i] == 1) {
                    pq.remove(i);
                    v[i] = 1;
                    nv[i] = 0;
                } else {
                    nv[i] = 1;
                    pq.add(i);
                }
            }
        }
        if(pq.isEmpty())
            return -1;
        else
            return pq.poll();
    }
}