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
    public TreeNode addOneRow(TreeNode root, int val, int depth) {
        if(root == null ) {
            return null;
        } else if(depth == 2) {
            TreeNode left = new TreeNode(val);
            left.left = root.left;
            root.left = left;
            
            TreeNode right = new TreeNode(val);
            right.right = root.right;
            root.right = right;
            return root;
        } else if (depth == 1) {
            TreeNode left = new TreeNode(val);
            left.left = root;
            return left;            
        } else {
            addOneRow(root.left, val, depth-1);
            addOneRow(root.right, val, depth-1);
            return root;
        }
    }
}