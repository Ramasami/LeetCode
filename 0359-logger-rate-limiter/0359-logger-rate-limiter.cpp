class Logger {
public:
    
    queue<pair<string, int>> *q;
    unordered_set<string> *s;
    
    Logger() {
        q = new queue<pair<string, int>>();
        s = new unordered_set<string>();
    }
    
    bool shouldPrintMessage(int timestamp, string message) {
        while(!q->empty() && timestamp - q->front().second >= 10) {
            pair p = q->front();
            s->erase(p.first);
            q->pop();
        }
        bool ans =  s->find(message) == s->end();
        if (ans) {
            q->push({message, timestamp});
            s->insert(message);
        }
        return ans;
    }
};

/**
 * Your Logger object will be instantiated and called as such:
 * Logger* obj = new Logger();
 * bool param_1 = obj->shouldPrintMessage(timestamp,message);
 */