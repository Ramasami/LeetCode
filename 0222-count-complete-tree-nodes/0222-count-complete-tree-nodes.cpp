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
    int countNodes(TreeNode* root) {
        queue<TreeNode*> ll;
        ll.push(root);
        int c = 0;
        while(!ll.empty()) {
            TreeNode* curr = ll.front();
            ll.pop();
            if(curr==NULL)
                continue;
            c++;
            ll.push(curr->left);
            ll.push(curr->right);
        }
        return c;
    }
};