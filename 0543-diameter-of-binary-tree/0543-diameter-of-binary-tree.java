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
    private static int ans = 0;
    public int diameterOfBinaryTree(TreeNode root) {
        ans = 0;
        parse(root);
        return ans;
    }
    
    public int parse(TreeNode root) {
        if(root == null)
            return 0;
        int left = parse(root.left);
        int right = parse(root.right);
        ans = Math.max(ans, left+right);
        return Math.max(left, right)+1;
    }
    
    
}