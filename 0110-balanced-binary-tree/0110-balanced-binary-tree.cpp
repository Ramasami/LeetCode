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
    bool isBalanced(TreeNode* root) {
        if (root == NULL)
            return true;
        else if (abs(height(root->left,0)-height(root->right,0))>1)
            return false;
        else
            return isBalanced(root->left) && isBalanced(root->right);
    }
    
    int height(TreeNode* root, int h) {
        if(root == NULL)
            return h;
        return max(height(root->left, h+1), height(root->right, h+1));
    }
};