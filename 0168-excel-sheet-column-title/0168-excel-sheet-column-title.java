class Solution {
    public String convertToTitle(int columnNumber) {
        StringBuilder ans = new StringBuilder();
        while(true) {
            columnNumber--;
            ans.append(((char)('A' + (columnNumber%26))));
            columnNumber/=26;
            if (columnNumber == 0) {
                return ans.reverse().toString();
            }
        }
    }
}