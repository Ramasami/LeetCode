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
    public int sumNumbers(TreeNode root) {
        if (root == null) 
            return 0;
        return sum(0, root);
    }
    
    private int sum(int val, TreeNode root) {
        if (root.left != null && root.right != null)
            return sum(val*10 + root.val, root.left) + sum(val*10 + root.val, root.right);
        else if (root.left != null)
            return sum(val*10 + root.val, root.left);
        else if (root.right != null)
            return sum(val*10 + root.val, root.right);
        else return 10 * val + root.val;
    }
}