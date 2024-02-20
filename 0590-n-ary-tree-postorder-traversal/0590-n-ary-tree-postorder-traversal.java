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
        List<Integer> ans = new LinkedList<>();
        if(root==null)
            return ans;
        LinkedList<Node> st = new LinkedList<>();
        st.push(root);
        while(!st.isEmpty()) {
            Node top = st.pollLast();
            ans.addFirst(top.val);
            for(Node n:top.children)
                st.add(n);
        }
        return ans;
    }
}