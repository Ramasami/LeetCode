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
    TreeNode* sortedArrayToBST(vector<int>& nums) {
        return makeTree(0,nums.size(),nums);
    }
    
    TreeNode* makeTree(int l, int r, vector<int>& nums) {
        if(l >= r) 
            return NULL;
        int m = l + (r-l)/2;
        TreeNode* tree = new TreeNode(nums[m]);
        tree->left = makeTree(l,m,nums);
        tree -> right = makeTree(m+1,r,nums);
        return tree;
    }
};