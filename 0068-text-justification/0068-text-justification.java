class Solution {
    public List<String> fullJustify(String[] words, int maxWidth) {
        List<String> ans = new ArrayList<>();
        int n = words.length;
        int l = 0;
        int r = 1;
        int length = words[0].length();
        while(r<n) {
            if (length + 1 + words[r].length() <= maxWidth) {
                length += 1 + words[r].length();
            } else {
                ans.add(generate(l,r-1,words, length, maxWidth, false));
                l = r;
                length=words[r].length();
            }
            r++; 
        }
        ans.add(generate(l,r-1,words, length,maxWidth,true ));
        return ans;
    }
    private String generate(int l, int r, String[] words, int length, int maxWidth, boolean left) {
        StringBuilder sb = new StringBuilder();
        if (r==l || left) {
            for(int i=l;i<r;i++) {
                sb.append(words[i]);
                sb.append(" ");
            }
            sb.append(words[r]);
            addSpaces(sb, maxWidth - sb.length());
        } else {
            int n = r-l+1;
            int lenWOSpace = length - (n - 1);
            int spaces = maxWidth - lenWOSpace;
            int numOfSpaces = spaces / (n-1);
            int j=0;
            int i=l;
            int x = spaces%(n-1);
            for(;i<r && j<x;j++,i++) {
                sb.append(words[i]);
                addSpaces(sb, numOfSpaces+1);
            }
            for(;i<r;i++) {
                sb.append(words[i]);
                addSpaces(sb, numOfSpaces);
            }
            sb.append(words[r]);
        }
        
        
        return sb.toString();
    }
    
    private void addSpaces(StringBuilder sb, int n) {
        for(int i=0;i<n;i++)
            sb.append(" ");
    }
}