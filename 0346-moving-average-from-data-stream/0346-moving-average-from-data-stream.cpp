class MovingAverage {
public:
    
    double sum = 0;
    int size = 0;
    queue<int> *q;
    
    MovingAverage(int size) {
        this->size = size;
        q = new queue<int>();
        sum = 0;
    }
    
    double next(int val) {
        if(q->size() == size) {
            sum-=q->front();
            q->pop();
        } 
        
        sum+=val;
        q->push(val);
        return sum/q->size();
    }
};

/**
 * Your MovingAverage object will be instantiated and called as such:
 * MovingAverage* obj = new MovingAverage(size);
 * double param_1 = obj->next(val);
 */