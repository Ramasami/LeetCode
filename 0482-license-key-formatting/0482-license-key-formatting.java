class Solution {
    public String licenseKeyFormatting(String s, int k) {
        StringBuilder sb = new StringBuilder();
        int i = s.length() - 1;
        for(int j=0;i>=0;i--) {
            char c = s.charAt(i);
            if (c == '-')
                continue;
            else {
                if(j==k ) {
                    sb.append('-');
                    j=1;
                } else {
                    j++;
                }
                sb.append(Character.toUpperCase(c));
            }
            
        }
        return sb.reverse().toString();
    }
}