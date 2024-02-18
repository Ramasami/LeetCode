class Solution {
public:
    vector<int> plusOne(vector<int>& digits) {
        int c = 1;
        for (int i = digits.size() - 1;i>=0;i--) {
            digits[i] += c;
            c = digits[i]/10;
            digits[i]%=10;
            if(c==0)
                break;
        }
        if (c==1) {
            vector<int> ans(digits.size() + 1);
            ans[0] = 1;
            for(int i=0;i<digits.size();i++) {
                ans[i+1] = digits[i];
            }
            return ans;
        } else {
            return digits;
        }
    }
};