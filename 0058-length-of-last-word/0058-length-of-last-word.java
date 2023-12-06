class Solution {
    public int lengthOfLastWord(String s) {
        int ans = 0;
        int l = 0;
        for(int i = 0;i<s.length();i++) {
            if (s.charAt(i) == ' ') {
                if(l!=0)
                    ans = l;
                l = 0;
            } else {
                l++;
            }
        }
        if(l!=0)
            ans = l;
        return ans;
    }
}