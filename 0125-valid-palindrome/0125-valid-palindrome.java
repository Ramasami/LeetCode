class Solution {
    public boolean isPalindrome(String s) {
        int l = 0,r = s.length()-1;
        while(l<=r) {
            char cL = 0,cR = 1;
            while(l<=r) {
                cL = s.charAt(l);
                cL = Character.toLowerCase(cL);
                if ((cL >= 'a' && cL <= 'z') || (cL >= '0' && cL <= '9'))
                    break;
                l++;
            }
            while(l<=r) {
                cR = s.charAt(r);
                cR = Character.toLowerCase(cR);
                if ((cR >='a' && cR <= 'z') || (cR >='0' && cR <= '9'))
                    break;
                r--;
            }
            if(l >= r)
                return true;
            if (cL != cR)
                return false;
            l++;
            r--;
        }
        return true;
    }
}