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
    vector<int> preorderTraversal(TreeNode* root) {
        vector<int> ans;
        stack<TreeNode*> q;
        q.push(root);
        while(!q.empty()) {
            TreeNode* curr = q.top();
            q.pop();
            if(curr!=NULL) {
                ans.push_back(curr->val);
                q.push(curr->right);
                q.push(curr->left);
            }
            
        }
        return ans;
    }

};