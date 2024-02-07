class Solution {
    
    private static final String FIZZ = "Fizz";
    private static final String BUZZ = "Buzz";
    private static final String FIZZBUZZ = "FizzBuzz";
    
    public List<String> fizzBuzz(int n) {
        List<String> ans = new ArrayList<>();
        for(int i = 1;i<=n;i++) {
            if(i%15 == 0)
                ans.add(FIZZBUZZ);
            else if(i%3 == 0)
                ans.add(FIZZ);
            else if(i%5 == 0)
                ans.add(BUZZ);
            else
                ans.add(String.valueOf(i));
        }
        return ans;
    }
}