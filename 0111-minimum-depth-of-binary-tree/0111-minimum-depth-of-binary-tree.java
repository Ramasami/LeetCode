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
    public int minDepth(TreeNode root) {
        if(root == null)
            return 0;
        if (root.left == null && root.right == null)
            return 1;
        int leftDepth = root.left == null?Integer.MAX_VALUE:minDepth(root.left)+1;
        int rightDepth = root.right == null?Integer.MAX_VALUE:minDepth(root.right)+1;
        return Math.min(leftDepth, rightDepth);
    }
}