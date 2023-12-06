class Solution {
    public String addBinary(String a, String b) {
       StringBuilder sb = new StringBuilder();
        int i = 0;
        int C = 0;
        while(i<a.length() && i <b.length()) {
            int A = a.charAt(a.length() - 1 - i ) - '0';
            int B = b.charAt(b.length() - 1 - i) - '0';
            C = A + B + C;
            switch (C) {
                case 0:sb.append(0);C=0;break;
                case 1:sb.append(1);C=0;break;
                case 2:sb.append(0);C=1;break;
                case 3:sb.append(1);C=1;break;
            }
            i++;
        }
        a = a.length() > b.length() ? a : b;
        while(i<a.length()) {
            int A = a.charAt(a.length() - 1 - i)- '0';
            C = A + C;
            switch (C) {
                case 0:sb.append(0);C=0;break;
                case 1:sb.append(1);C=0;break;
                case 2:sb.append(0);C=1;break;
                case 3:sb.append(1);C=1;break;
            }
            i++;
        }
        if (C == 1)
            sb.append('1');
        return sb.reverse().toString();
    }
}