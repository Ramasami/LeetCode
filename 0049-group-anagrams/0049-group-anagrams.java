class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> ans = new HashMap<>();
        for(String s : strs) {
            String h = hash(s);
            ans.putIfAbsent(h, new ArrayList<>());
            ans.get(h).add(s);
        }
        return new ArrayList<>(ans.values());
    }
    
    private String hash(String s) {
        int[] count = new int[26];
        for(Character c: s.toCharArray()) {
            count[c-'a']++;
        }
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<26;i++) {
            sb.append(count[i] + "#");
        }
        return sb.toString();
    }
}