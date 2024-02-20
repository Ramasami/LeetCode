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
    vector<int> postorder(Node* root) {
        if (root == NULL)
            return vector<int>();
        list<Node*> st;
        st.push_back(root);
        list<int> ans;
        while(!st.empty()) {
            Node* top = st.back();
            st.pop_back();
            ans.push_front(top->val);
            for(auto it=top->children.begin();it!=top->children.end();it++) {
                st.push_back(*it);
            }
        }
        vector<int> finalAns;
        for(auto it=ans.begin();it!=ans.end();it++)
            finalAns.push_back(*it);
        return finalAns;
    }
};