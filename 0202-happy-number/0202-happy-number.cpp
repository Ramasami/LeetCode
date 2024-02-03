class Solution {
public:
    bool isHappy(int n) {
        unordered_set<int> visited;
        visited.insert(n);
        while(n!=1) {
            int sum = 0;
            int t = n;
            while(t!=0) {
                int digit = t%10;
                t/=10;
                sum+=digit*digit;
            }
            n = sum;
            if (visited.find(n) != visited.end()) {
                return false;
            }
            visited.insert(n);
        }
        return true;
    }
};