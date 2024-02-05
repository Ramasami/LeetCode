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
    public int countNodes(TreeNode root) {
        LinkedList<TreeNode> ll = new LinkedList<>();
        ll.add(root);
        int c = 0;
        while(!ll.isEmpty()) {
            TreeNode curr = ll.pollFirst();
            if(curr==null)
                continue;
            c++;
            ll.add(curr.left);
            ll.add(curr.right);
        }
        return c;
    }
}