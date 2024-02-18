class Solution {
public:
    string toHex(int num) {
        const vector<char> hex{'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};
        string ans;
        unsigned n = num;
        while (n!=0) {
          ans += hex[n & 0xf];
          n = n >> 4;
        }
        reverse(ans.begin(), ans.end());
        return ans.empty() ? "0" : ans;
    }
};



