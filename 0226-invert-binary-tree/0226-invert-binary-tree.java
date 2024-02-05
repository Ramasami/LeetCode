/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public TreeNode invertTree(TreeNode root) {
        LinkedList<TreeNode> ll = new LinkedList<>();
        ll.add(root);
        while(!ll.isEmpty()) {
            TreeNode t = ll.pollFirst();
            if(t == null)
                continue;
            TreeNode left = t.left;
            t.left = t.right;
            t.right = left;
            ll.addLast(t.left);
            ll.addLast(t.right);
        }
        return root;
    }
}