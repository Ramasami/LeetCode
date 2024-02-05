class MovingAverage {

    private double sum = 0;
    private int size = 0;
    private Queue<Integer> q;
    
    
    public MovingAverage(int size) {
        q = new LinkedList<>();
        this.size = size;
        sum = 0;
    }
    
    public double next(int val) {
        if(q.size() == size) {
            sum-=q.poll();
        } 
        
        sum+=val;
        q.add(val);
        return sum/q.size();
    }
}


/**
 * Your MovingAverage object will be instantiated and called as such:
 * MovingAverage obj = new MovingAverage(size);
 * double param_1 = obj.next(val);
 */