class Solution {
public:
    bool isValid(string s) {
        stack<char> stack;
        stack.push('.');
        for(int i = 0;i<s.length();i++) {
            char top = stack.top();
            switch(s[i]) {
                case '}': if (stack.empty() || top != '{') return false; stack.pop(); break;
                case ']': if (stack.empty() || top != '[') return false; stack.pop(); break;
                case ')': if (stack.empty() || top != '(') return false; stack.pop(); break;
                default: stack.push(s[i]);
            }
        }
        return stack.size() == 1;
    }
};