class Solution {
    public int lengthOfLongestSubstringKDistinct(String s, int k) {
        int l = 0,r = 0;
        int[] c = new int[256];
        int distinct = 0;
        int n = s.length();
        int ans=0;
        for(r=0;r<n;r++) {
            int cr = s.charAt(r);
            if(c[cr] == 0)
                distinct++;
            c[cr]++;
            while(distinct > k && l<=r) {
                int cl = s.charAt(l);
                if(c[cl]==1) {
                    distinct--;
                }
                l++;
                c[cl]--;
            }
            ans=Math.max(r-l+1, ans);
        }
        return ans;
    }
}