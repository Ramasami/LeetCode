class Solution {
public:
    int countPrefixSuffixPairs(vector<string>& words) {
       int ans = 0;
        int n = words.size();
        for(int i=0;i<n;i++) {
            for(int j=i+1;j<n;j++) {
                if(isPrefixAndSuffix(words[i],words[j])){
                    ans++;
                }
            }
        }
        return ans;
    }
    
    bool isPrefixAndSuffix(string a, string b) {
        int na = a.length();
        int nb = b.length();
        if(na > nb)
            return false;
        if(na == nb)
            return a == b;
        for(int i=0,j=nb-na;i<na;i++,j++) {
            char c = a[i];
            if(c != b[i] || c!=b[j])
                return false;
        }
        return true;
    }
};