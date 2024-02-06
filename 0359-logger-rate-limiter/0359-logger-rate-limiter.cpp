class Logger {
public:
    
    queue<pair<string, int>> *q;
    unordered_map<string, int> *m;
    
    Logger() {
        q = new queue<pair<string, int>>();
        m = new unordered_map<string, int>();
    }
    
    bool shouldPrintMessage(int timestamp, string message) {
        while(!q->empty() && timestamp - q->front().second >= 10) {
            pair p = q->front();
            if((*m)[p.first] == p.second)
                m->erase(p.first);
            q->pop();
        }
        bool ans =  m->find(message) == m->end();
        if (ans) {
            q->push({message, timestamp});
            (*m)[message] = timestamp;
        }
        return ans;
    }
};

/**
 * Your Logger object will be instantiated and called as such:
 * Logger* obj = new Logger();
 * bool param_1 = obj->shouldPrintMessage(timestamp,message);
 */