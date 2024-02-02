class Solution {
public:
    string addBinary(string a, string b) {
        int l=a.length()-1;
        int r=b.length()-1;
        string ans;
        int c = 0;
        while(l>=0 && r>=0) {
            int sum = a[l]-'0'+b[r]-'0'+c;
            if(sum == 2) {
                c = 1;
                sum = 0;
            } else if(sum == 3) {
                c = 1;
                sum = 1;
            } else {
                c = 0;
            }
            ans = (char)(sum + '0') + ans;
            l--;
            r--;
        }
        while(l>=0) {
            int sum = a[l]-'0'+c;
            if(sum == 2) {
                c = 1;
                sum = 0;
            } else if(sum == 3) {
                c = 1;
                sum = 1;
            } else {
                c = 0;
            }
            ans = (char)(sum + '0') + ans;
            l--;
        }
        while(r>=0) {
            int sum = b[r]-'0'+c;
            if(sum == 2) {
                c = 1;
                sum = 0;
            } else if(sum == 3) {
                c = 1;
                sum = 1;
            } else {
                c = 0;
            }
            ans = (char)(sum + '0') + ans;
            r--;
        }
        if(c==1){
            ans = '1' + ans;
        }
        return ans;
    }
};