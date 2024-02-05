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
    int closestValue(TreeNode* root, double target) {
        int ans = root->val;
        double diff = abs(root->val - target);
        while(root!=NULL) {
            double diff2 = abs(root->val - target);
            if (diff2 < diff || (diff2 == diff && ans > root->val)) {
                diff = diff2;
                ans = root->val;
            }
            if (root->val > target) {
                root = root->left;
            } else {
                root = root->right;
            } 
            
        }
            return ans;
    }
        
};