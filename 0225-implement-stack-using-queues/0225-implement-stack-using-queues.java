class MyStack {
    
    LinkedList<Integer> ll;
    Integer top = null;

    public MyStack() {
        ll = new LinkedList<>();
        top = null;
    }
    
    public void push(int x) {
        ll.add(x);
        top = x;
    }
    
    public int pop() {
        LinkedList<Integer> t = new LinkedList<>();
        while(ll.size() > 2)
            t.add(ll.pollFirst());
        if (ll.size() == 2) {
            top = ll.peekFirst();
            t.add(ll.pollFirst());
        }
        int pop = ll.pollFirst();
        
        System.out.println(t.size() + " " + ll.size());
        while(!t.isEmpty())
            ll.add(t.pollFirst());
        return pop;
    }
    
    public int top() {
       return top; 
    }
    
    public boolean empty() {
        return ll.isEmpty();
    }
}

/**
 * Your MyStack object will be instantiated and called as such:
 * MyStack obj = new MyStack();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.top();
 * boolean param_4 = obj.empty();
 */