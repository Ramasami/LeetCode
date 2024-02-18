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
    int sumOfLeftLeaves(TreeNode* root) {
       int sum = 0;
        while (root) {
        if (!root->left) {
          root = root->right;
        } else {
          struct TreeNode* pre = root->left;
          if (pre->left == NULL && pre->right == NULL) sum += pre->val;
          while (pre->right && pre->right != root) pre = pre->right;
          if (!pre->right) {
            pre->right = root;
            root = root->left;
          } else {
            pre->right = NULL;
            root = root->right;
          }
        }
        }
        return sum; 
    }
};