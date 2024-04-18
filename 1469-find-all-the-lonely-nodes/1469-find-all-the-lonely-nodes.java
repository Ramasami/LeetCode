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
    public List<Integer> getLonelyNodes(TreeNode root) {
        List<Integer> ans = new LinkedList<>();
        if(root == null)
            return ans;
        find(root, ans, false);
        return ans;
    }
    
    private void find(TreeNode root, List<Integer> ans, boolean lonely) {
        if(lonely)
            ans.add(root.val);
        if(root.left == null && root.right == null) {
            return;
        }
        else if(root.left !=null && root.right != null) {
            find(root.left, ans, false);
            find(root.right, ans, false);
        } else if(root.left != null) {
            find(root.left, ans, true);
        } else if(root.right != null) {
            find(root.right, ans, true);
        }
    }
}