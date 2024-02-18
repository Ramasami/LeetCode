class MyStack {
public:
    
    queue<int> q;
    int topValue = 0;
    int size = 0;
    
    MyStack() {
        q = queue<int>();
        size = 0;
    }
    
    void push(int x) {
        q.push(x);
        topValue = x;
        size++;
    }
    
    int pop() {
        size--;
        for(int i=0;i<size-1;i++) {
            q.push(q.front());
            q.pop();
        }
        topValue = q.front();
        q.push(q.front());
        q.pop();
        int result = q.front();
        q.pop();
        return result;
    }
    
    int top() {
        return topValue; 
    }
    
    bool empty() {
        return size==0;
    }
};

/**
 * Your MyStack object will be instantiated and called as such:
 * MyStack* obj = new MyStack();
 * obj->push(x);
 * int param_2 = obj->pop();
 * int param_3 = obj->top();
 * bool param_4 = obj->empty();
 */