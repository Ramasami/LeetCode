/*
// Definition for a Node.
class Node {
    public int val;
    public List<Node> children;

    public Node() {}

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, List<Node> _children) {
        val = _val;
        children = _children;
    }
};
*/

class Solution {
    public List<Integer> postorder(Node root) {
        List<Integer> ans = new ArrayList<>();
        if(root==null)
            return ans;
        Set<Node> visited = new HashSet<>();
        Stack<Node> st = new Stack<>();
        st.push(root);
        while(!st.isEmpty()) {
            Node top = st.peek();
            if(visited.contains(top)) {
                ans.add(top.val);
                st.pop();
            } else {
                for(int i=top.children.size()-1;i>=0;i--)
                    st.push(top.children.get(i));
                visited.add(top);
            }
        }
        return ans;
    }
}