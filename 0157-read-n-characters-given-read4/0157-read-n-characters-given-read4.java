/**
 * The read4 API is defined in the parent class Reader4.
 *     int read4(char[] buf4);
 */

public class Solution extends Reader4 {
    /**
     * @param buf Destination buffer
     * @param n   Number of characters to read
     * @return    The number of actual characters read
     */
    public int read(char[] buf, int n) {
        for (int i=0;i*4<n;i++) {
            char[] buf4 = new char[4];
            int charRead = read4(buf4);
            for(int j = i*4,k=0;k<charRead && i*4+k<n;j++,k++) {
                buf[j] = buf4[k];
            }
            if(charRead < 4) {
                return Math.min(i*4+charRead,n);
            }
        }
        return n;
    }
}