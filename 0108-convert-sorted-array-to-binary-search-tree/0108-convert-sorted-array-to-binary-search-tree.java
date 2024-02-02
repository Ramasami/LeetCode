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
    public TreeNode sortedArrayToBST(int[] nums) {
        return makeTree(0, nums.length, nums);
    }
    
    TreeNode makeTree(int l, int r, int[] nums) {
        if(l >= r) 
            return null;
        int m = l + (r-l)/2;
        TreeNode tree = new TreeNode(nums[m]);
        tree.left = makeTree(l,m,nums);
        tree.right = makeTree(m+1,r,nums);
        return tree;
    }
}