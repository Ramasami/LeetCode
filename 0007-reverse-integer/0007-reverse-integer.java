class Solution {
    public int reverse(int x) {
        boolean neg = x < 0;
        x = neg?-x:x;
        int ans = 0;
        int digit = 0;
        int max = 214748364;
        while(x>0){
            ans = 10*ans+x%10;
            x/=10;
            if((x!=0 && digit == 8 && (ans > 214748364)))
                return 0;
            digit++;
        }
        return neg?-ans:ans;
    }
}