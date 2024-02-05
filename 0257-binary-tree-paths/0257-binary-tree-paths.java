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
    public List<String> binaryTreePaths(TreeNode root) {
        List<String> ans = new ArrayList<>();
        if (root == null)
            return ans;
        binaryTreePaths(root,new StringBuilder(),ans,true);
        return ans;
    }
    
    void binaryTreePaths(TreeNode root, StringBuilder s,List<String> ans,boolean first) {
        if(root == null)
            return;
        int n = s.length();
        if(!first)
            s.append("->");
        s.append(root.val);
        if(root.left == null && root.right == null) 
            ans.add(s.toString());
        else {
            binaryTreePaths(root.left,s,ans, false);
            binaryTreePaths(root.right,s,ans, false);
        }
        s.replace(n,s.length(),"");
    }
}