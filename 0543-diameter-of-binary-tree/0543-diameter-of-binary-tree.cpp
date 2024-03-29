/**
 * Definition for a binary tree node.
 * struct TreeNode {
 *     int val;
 *     TreeNode *left;
 *     TreeNode *right;
 *     TreeNode() : val(0), left(nullptr), right(nullptr) {}
 *     TreeNode(int x) : val(x), left(nullptr), right(nullptr) {}
 *     TreeNode(int x, TreeNode *left, TreeNode *right) : val(x), left(left), right(right) {}
 * };
 */
class Solution {
public:
    int ans = 0;
    int diameterOfBinaryTree(TreeNode* root) {
        ans = 0;
        parse(root);
        return ans;
    }
    
    int parse(TreeNode* root) {
        if(root == NULL)
            return 0;
        int left = parse(root->left);
        int right = parse(root->right);
        ans = max(ans, left+right);
        return max(left, right)+1;
    }
};