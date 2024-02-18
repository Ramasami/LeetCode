class Solution {
    public int countPrefixSuffixPairs(String[] words) {
        int ans = 0;
        int n = words.length;
        for(int i=0;i<n;i++) {
            for(int j=i+1;j<n;j++) {
                if(isPrefixAndSuffix(words[i],words[j])){
                    ans++;
                }
            }
        }
        return ans;
    }
    
    public boolean isPrefixAndSuffix(String a, String b) {
        int na = a.length();
        int nb = b.length();
        if(na > nb)
            return false;
        if(na == nb)
            return a.equals(b);
        for(int i=0;i<na;i++) {
            char c = a.charAt(i);
            if(c != b.charAt(i) || c!=b.charAt(nb-na + i))
                return false;
        }
        return true;
    }
}