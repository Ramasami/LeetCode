class LRUCache {
    
    Map<Integer, Pair<Integer, Integer>> m;
    Map<Integer, Integer> tm;
    int capacity;
    int t;
    int last;

    public LRUCache(int capacity) {
        this.m = new HashMap<>(capacity);
        this.tm = new HashMap<>();
        this.capacity = capacity;
        this.t = 0;
        this.last = 0;
    }
    
    public int get(int key) {
        Integer value = removeKey(key);
        if (value!=null) {
            int c = t++;
            tm.put(c, key);
            m.put(key, new Pair<>(c, value));
            return value;
        } else {
            return -1;
        }
    }
    
    public void put(int key, int value) {
        removeKey(key);
        int c = t++;
        tm.put(c, key);
        m.put(key, new Pair<>(c, value));
        check();
    }
    
    private Integer removeKey(int key) {
        if (m.containsKey(key)) {
            tm.remove(m.get(key).getKey());
            return m.get(key).getValue();
        } else {
            return null;
        }
    }
    
    private void check() {
        while(m.size() > capacity) {
            if(tm.containsKey(last)) {
                m.remove(tm.get(last));
                tm.remove(last);
            }
            last++;
        }
    }
}

/**
 * Your LRUCache object will be instantiated and called as such:
 * LRUCache obj = new LRUCache(capacity);
 * int param_1 = obj.get(key);
 * obj.put(key,value);
 */