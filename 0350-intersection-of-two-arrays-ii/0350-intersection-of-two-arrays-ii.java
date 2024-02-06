class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        int a[] = new int[1001];
        List<Integer> ans = new ArrayList<>();
        for(int i=0;i<nums1.length;i++)
            a[nums1[i]]++;
        for(int i=0;i<nums2.length;i++) {
            if(a[nums2[i]]>0) {
                ans.add(nums2[i]);
                a[nums2[i]]--;
            }
        }
        a = new int[ans.size()];
        for(int i=0;i<ans.size();i++) {
            a[i] = ans.get(i);
        }
            
        return a;
    }
}