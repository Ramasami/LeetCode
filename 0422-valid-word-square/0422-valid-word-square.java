class Solution {
    public boolean validWordSquare(List<String> words) {
        int l = words.size();
        for(int i=0;i<l;i++) {
            for(int j=0;j<words.get(i).length();j++) {
                if (j >= words.size() || j >= words.get(i).length() || i >= words.get(j).length()) {
                    return false;
                }
                if (words.get(i).charAt(j) != words.get(j).charAt(i)) {
                    return false;
                }
            }
        }
        return true;
    }
}