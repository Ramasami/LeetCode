class Solution {
public:
    string FIZZ = "Fizz";
    string BUZZ = "Buzz";
    string FIZZBUZZ = "FizzBuzz";
    
    vector<string> fizzBuzz(int n) {
        vector<string> ans;
        for(int i = 1;i<=n;i++) {
            if(i%15 == 0)
                ans.push_back(FIZZBUZZ);
            else if(i%3 == 0)
                ans.push_back(FIZZ);
            else if(i%5 == 0)
                ans.push_back(BUZZ);
            else
                ans.push_back(to_string(i));
        }
        return ans;
    }
};