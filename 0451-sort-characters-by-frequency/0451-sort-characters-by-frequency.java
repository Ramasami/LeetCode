class Solution {
    public String frequencySort(String s) {
        int a[] = new int[62];
        for(char c:s.toCharArray()) {
            if (c >= 'a' && c<='z') {
                a[c-'a']++;
            } else if (c >= 'A' && c<='Z'){
                a[c-'A'+26]++;
            } else {
                a[c-'0'+52]++;
            }
        }
        Map<Integer, List<Character>> m = new TreeMap((i1,i2)->((Integer)i2).compareTo((Integer)i1));
        for(int i=0;i<26;i++) {
            m.putIfAbsent(a[i],new ArrayList<>());
            m.get(a[i]).add((char)(i+'a'));
        }
        for(int i=26;i<52;i++) {
            m.putIfAbsent(a[i],new ArrayList<>());
            m.get(a[i]).add((char)(i-26+'A'));
        }
        for(int i=52;i<62;i++) {
            m.putIfAbsent(a[i],new ArrayList<>());
            m.get(a[i]).add((char)(i-52+'0'));
        }
        StringBuilder sb = new StringBuilder();
        for(Integer n: m.keySet()) {
            List<Character> l = m.get(n);
            for(Character c: l) {
                for(int i=0;i<n;i++)
                    sb.append(c);
            }
        }
        return sb.toString();
    }
}