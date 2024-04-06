class Solution {
    public String minRemoveToMakeValid(String s) {
        Set<Integer> toRemove = new HashSet<>();
        Stack<Integer> open = new Stack<>();
        int i = 0;
        for(char c: s.toCharArray()) {
            if(c == ')') {
                if(!open.isEmpty()) {
                    open.pop();
                } else {
                    toRemove.add(i);
                }
            } else if (c == '(') {
                open.push(i);
            } 
            i++;
        }
        while(!open.isEmpty()) {
            toRemove.add(open.pop());
        }
        StringBuilder sb = new StringBuilder();
        i = 0;
        for(char c: s.toCharArray()) {
            if(!toRemove.contains(i)) {
                sb.append(c);
            }
            i++;
        }
        return sb.toString();
    }
}