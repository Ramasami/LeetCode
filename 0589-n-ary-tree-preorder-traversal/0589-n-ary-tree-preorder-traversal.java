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
    public List<Integer> preorder(Node root) {
        List<Integer> ans = new ArrayList<>();
        if(root == null)
            return ans;
        Stack<Node> q = new Stack<>();
        q.push(root);
        
        while(!q.isEmpty()) {
            Node front = q.pop();
            ans.add(front.val);
            int n = front.children.size();
            for(int i=n-1;i>=0;i--) {
                q.push(front.children.get(i));
            }
        }
        return ans;
    }
}