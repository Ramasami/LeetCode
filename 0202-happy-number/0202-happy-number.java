class Solution {
    
    private int calculate(int n) {
        int ans = 0;
        while(n>0) {
            int t = n%10;
            ans+= t * t;
            n/=10;
        }
        return ans;
    }
    
    public boolean isHappy(int n) {
        Set<Integer> visited = new HashSet<>();
        while(true) {
            if (n == 1)
                return true;
            if (visited.contains(n))
                return false;
            visited.add(n);
            n = calculate(n);
        }
    }
}
