class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> s = new Stack<>();
        for(String token: tokens) {
            switch(token) {
                case "+": {
                    s.push(s.pop() + s.pop());
                    break;
                }
                case "-": {
                    s.push(-s.pop() + s.pop());
                    break;
                }
                case "*": {
                    s.push(s.pop() * s.pop());
                    break;
                }
                case "/": {
                    int t = s.pop();
                    s.push(s.pop() / t);
                    break;
                }
                default: {
                    s.push(Integer.valueOf(token));
                }
            }
        }
        return s.peek();
    }
}