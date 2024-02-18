class TwoSum {
public:
    
    unordered_map<int, int>* map;
    TwoSum() {
        map = new unordered_map<int, int>();
    }
    
    void add(int number) {
        (*map)[number]++;
    }
    
    bool find(int value) {
        for(unordered_map<int, int>::iterator it = map->begin();it!=map->end();it++) {
            if (((long)it->first == (long)value - it->first) && it->second>1) {
                return true;
            } else if (((long)it->first != (long)value - it->first) && map->find((long)value - it->first) != map->end()) {
                return true;
            }
        }
        return false;
    }
};

/**
 * Your TwoSum object will be instantiated and called as such:
 * TwoSum* obj = new TwoSum();
 * obj->add(number);
 * bool param_2 = obj->find(value);
 */