/*
// Definition for a Node.
class Node {
public:
    int val;
    vector<Node*> children;

    Node() {}

    Node(int _val) {
        val = _val;
    }

    Node(int _val, vector<Node*> _children) {
        val = _val;
        children = _children;
    }
};
*/

class Solution {
public:
    vector<int> preorder(Node* root) {
        vector<int> ans;
        if(root == NULL)
            return ans;
        stack<Node*> q;
        q.push(root);
        
        while(!q.empty()) {
            Node* front = q.top();
            q.pop();
            ans.push_back(front->val);
            for(auto it = front -> children.rbegin();it!=front->children.rend();it++) {
                q.push(*it);
            }
        }
        return ans;
    }
};