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
        if (root == null) return null;
        Queue<TreeNode> ll = new LinkedList<>();
        ll.add(root);
        while(!ll.isEmpty()) {
            TreeNode t = ll.poll();
            TreeNode left = t.left;
            t.left = t.right;
            t.right = left;
            if (t.left != null) ll.add(t.left);
            if (t.right != null) ll.add(t.right);
        }
        return root;
    }
}