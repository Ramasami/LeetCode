class Solution {
    public String removeVowels(String s) {
        StringBuilder sb = new StringBuilder();
        for(char c:s.toCharArray()) {
            switch(c) {
                case 'a':
                case 'e':
                case 'i':
                case 'o':
                case 'u': break;
                default: sb.append(c);
            }
        }
        return sb.toString();
    }
}