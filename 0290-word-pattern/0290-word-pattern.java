class Solution {
    public boolean wordPattern(String pattern, String s) {
        Map<Character, String> patternMap = new HashMap<>();
        Map<String, Character> keyMap = new HashMap<>();
        int sn = s.length();
        int pn = pattern.length();
        StringBuilder sb = new StringBuilder();
        int j = 0;
        for(int i=0;i<sn;i++) {
            char c = s.charAt(i);
            if (c == ' ') {
                String key = sb.toString();
                sb.delete(0, sb.length());
                char pc = pattern.charAt(j++);
                if (j==pattern.length())
                    return false;
                if(patternMap.containsKey(pc) && (!keyMap.containsKey(key) || !patternMap.get(pc).equals(key) || keyMap.get(key)!=pc)) 
                    return false;
                else {
                    patternMap.put(pc, key);
                    keyMap.put(key, pc);
                }
            } else {
                sb.append(c);
            }
        }
        String key = sb.toString();
        char pc = pattern.charAt(j++);
        return j == pattern.length() 
            && (
            (
                patternMap.containsKey(pc) 
                && keyMap.containsKey(key) 
                && patternMap.get(pc).equals(key) 
                && keyMap.get(key) == pc
           ) 
        || (
                !patternMap.containsKey(pc) 
                && !keyMap.containsKey(key) 
               )
        );
    }
}