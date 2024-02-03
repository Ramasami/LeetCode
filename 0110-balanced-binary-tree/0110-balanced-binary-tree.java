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
    
    public boolean isBalanced(TreeNode root) {
        if (root == null)
           return true;
        else if (Math.abs(height(root.left,0)-height(root.right,0)) > 1)
            return false;
        else
            return isBalanced(root.left) && isBalanced(root.right);
    }

    private int height(TreeNode root, int h) {
        if (root == null)
            return h;
        return Math.max(height(root.left, h+1),height(root.right, h+1));
    }
    
}