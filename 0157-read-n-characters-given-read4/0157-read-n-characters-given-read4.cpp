/**
 * The read4 API is defined in the parent class Reader4.
 *     int read4(char *buf4);
 */

class Solution {
public:
    /**
     * @param buf Destination buffer
     * @param n   Number of characters to read
     * @return    The number of actual characters read
     */
    int read(char *buf, int n) {
        int ans = 0;
        char buf4[4];
        
        for(int i=0;i<=(n-1)/4;i++){
            int curr = read4(buf4);
            if(curr<=0)
                return ans;
            for(int j=0;j<curr && i*4+j<n;j++) {
                buf[i*4+j] = buf4[j];
            }
            ans+=curr;
        }
        return ans;
    }
};