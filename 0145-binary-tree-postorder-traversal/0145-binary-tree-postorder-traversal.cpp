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
    vector<int> postorderTraversal(TreeNode* root) {
        vector<int> ans;
        unordered_set<TreeNode*> visited;
        stack<TreeNode*> s;
        s.push(root);
        while(!s.empty()) {
            TreeNode* curr = s.top();
            if(curr!=NULL) {
                if(visited.find(curr) == visited.end()) {
                    visited.insert(curr);
                    s.push(curr->right);
                    s.push(curr->left);
                } else {
                    ans.push_back(curr->val);
                    s.pop();
                }
            } else {
                s.pop();
            }
        }
        return ans;
    }
};