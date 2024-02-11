class Solution {
    public String convert(String s, int numRows) {
        int n = s.length();
        if (n == 1 || numRows == 1)
            return s;
        int next = (2*(numRows-1));
        StringBuilder sb = new StringBuilder();
        
        for(int i=0;i*next<n;i++)
            sb.append(s.charAt(i*next));
        
        for (int i=1;i<numRows-1;i++) {
            int mid = (numRows-i)*2-2;
            for(int k = 0;i+k*next<n;k++) {
                sb.append(s.charAt(i+k*next));
                if(i+k*next+mid<n)
                    sb.append(s.charAt(i+k*next+mid));
            }
        }
        for(int i=0;numRows -1 + i*next<n;i++)
            sb.append(s.charAt(i*next-1+numRows));
        return sb.toString();
    }
}