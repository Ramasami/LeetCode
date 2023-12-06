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
    
    bool found = false;
public:
    bool hasPathSum(TreeNode* root, int targetSum) {
        if(root == NULL)
            return false;
        found = found || (targetSum == findSum(root, targetSum, 0));
        return found;
    }
    
    int findSum(TreeNode* root, int targetSum, int currentSum) {
        if(found || root == NULL)
            return 0;
        currentSum += root->val;
        int bSum = 0;
        if(root ->left != NULL){
            bSum = findSum(root->left, targetSum, currentSum);
            if (bSum + currentSum == targetSum) {
                found = true;
                return root->val + bSum;
            }
        }
        if (root->right!=NULL) {
            bSum = findSum(root->right, targetSum, currentSum);
            if (bSum + currentSum == targetSum) {
                found = true;
                return root->val + bSum;
            }
        }
        return root -> val + bSum;
        
    }
};