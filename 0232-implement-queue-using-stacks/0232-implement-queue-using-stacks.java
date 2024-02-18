class MyQueue {
    
    private Stack<Integer> stack;
    private Integer front = 0;

    public MyQueue() {
        stack = new Stack<>();
        front = 0;
    }
    
    public void push(int x) {
        if(stack.isEmpty())
            front = x;
        stack.push(x);
    }
    
    public int pop() {
        Stack<Integer> temp = new Stack<>();
        while(!stack.isEmpty())
            temp.push(stack.pop());
        int pop = temp.pop();
        if (!temp.isEmpty())
            front = temp.peek();
        while(!temp.isEmpty())
            stack.push(temp.pop());
        return pop;
    }
    
    public int peek() {
        return front;
    }
    
    public boolean empty() {
        return stack.isEmpty();
    }
}

/**
 * Your MyQueue object will be instantiated and called as such:
 * MyQueue obj = new MyQueue();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.peek();
 * boolean param_4 = obj.empty();
 */