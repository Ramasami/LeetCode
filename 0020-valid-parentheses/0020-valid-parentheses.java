class Solution {
    public boolean isValid(String s) {
        int n = s.length();
        Stack<Character> stack = new Stack<>();
        for(int i=0;i<n;i++) {
            Character top = null;
            switch(s.charAt(i)){
                case '{':
                case '[':
                case '(':
                        stack.push(s.charAt(i));
                        continue;
                case '}': top = '{'; break;
                case ']': top = '['; break;
                case ')': top = '('; break;
            }
            if (stack.isEmpty() || (top != null && !top.equals(stack.pop())))
                return false;
        }
        return stack.size() == 0;
    }
}