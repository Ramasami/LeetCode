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
    vector<string> binaryTreePaths(TreeNode* root) {
        vector<string> paths;
        if (root == NULL)
          return paths;

        stack<TreeNode*> node_stack;
        stack<string> path_stack;
        node_stack.push(root);
        path_stack.push(to_string(root->val));
        TreeNode* node;
        string path;

        while ( !node_stack.empty() ) {
            node = node_stack.top();
            node_stack.pop();
            path = path_stack.top();
            path_stack.pop();
            if ((node->left == NULL) && (node->right == NULL))
                paths.push_back(path);
            if (node->left != NULL) {
                node_stack.push(node->left);
                path_stack.push(path + "->" + to_string(node->left->val));
            }
            if (node->right != NULL) {
                node_stack.push(node->right);
                path_stack.push(path + "->" + to_string(node->right->val));
            }
        }
        return paths; 
    }
};