class Solution {
    
    private int check(int a, int b, int c, int d) {
        if((a*10+b <24) && (c*10+d<60)) {
            return a*1000 + b*100 + c*10 + d;
        } else {
            return -1;
        }
    }
    
    public String largestTimeFromDigits(int[] arr) {
        int ans = -1;
        ans = Math.max(ans, check(arr[0], arr[1], arr[2], arr[3]));
        ans = Math.max(ans, check(arr[0], arr[1], arr[3], arr[2]));
        ans = Math.max(ans, check(arr[0], arr[2], arr[1], arr[3]));
        ans = Math.max(ans, check(arr[0], arr[2], arr[3], arr[1]));
        ans = Math.max(ans, check(arr[0], arr[3], arr[1], arr[2]));
        ans = Math.max(ans, check(arr[0], arr[3], arr[2], arr[1]));
        ans = Math.max(ans, check(arr[1], arr[0], arr[2], arr[3]));
        ans = Math.max(ans, check(arr[1], arr[0], arr[3], arr[2]));
        ans = Math.max(ans, check(arr[1], arr[2], arr[0], arr[3]));
        ans = Math.max(ans, check(arr[1], arr[2], arr[3], arr[0]));
        ans = Math.max(ans, check(arr[1], arr[3], arr[0], arr[2]));
        ans = Math.max(ans, check(arr[1], arr[3], arr[2], arr[0]));
        ans = Math.max(ans, check(arr[2], arr[0], arr[1], arr[3]));
        ans = Math.max(ans, check(arr[2], arr[0], arr[3], arr[1]));
        ans = Math.max(ans, check(arr[2], arr[1], arr[0], arr[3]));
        ans = Math.max(ans, check(arr[2], arr[1], arr[3], arr[0]));
        ans = Math.max(ans, check(arr[2], arr[3], arr[0], arr[1]));
        ans = Math.max(ans, check(arr[2], arr[3], arr[1], arr[0]));
        ans = Math.max(ans, check(arr[3], arr[0], arr[1], arr[2]));
        ans = Math.max(ans, check(arr[3], arr[0], arr[2], arr[1]));
        ans = Math.max(ans, check(arr[3], arr[1], arr[0], arr[2]));
        ans = Math.max(ans, check(arr[3], arr[1], arr[2], arr[0]));
        ans = Math.max(ans, check(arr[3], arr[2], arr[0], arr[1]));
        ans = Math.max(ans, check(arr[3], arr[2], arr[1], arr[0]));
        if(ans == -1) {
            return "";
        } else {
            return ans/1000 + "" + (ans%1000)/100 + ":" + (ans%100)/10 + "" + (ans%10);
        }
    }
}