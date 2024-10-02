class ListNode {
    int key;
    int val;
    ListNode next;
    ListNode prev;

    public ListNode(int key, int val) {
        this.key = key;
        this.val = val;
    }
}

class LRUCache {
    
    Map<Integer, ListNode> m;
    int capacity;
    ListNode head;
    ListNode tail;

    public LRUCache(int capacity) {
        this.m = new HashMap<>(capacity);
        this.capacity = capacity;
        head = new ListNode(-1, -1);
        tail = head;
    }
    
    public int get(int key) {
        // System.out.println(key);
        try {
            if(m.containsKey(key)) {
                return reset(key).val;
            } else {
                return -1;
            }
        } finally {
            check();
        }
    }
    
    public void put(int key, int value) {
        // System.out.println(key + " " + value);
         try {
                 if(m.containsKey(key)) {
                reset(key).val = value;
            } else {
                ListNode temp = new ListNode(key, value);
                m.put(key, temp);
                head.next = temp;
                temp.prev = head;
                head = temp;
            } 
         }finally {
            check();
            }
        
    }
       
           
    private void check() {
        while (m.size() > capacity) {
            if (m.containsKey(tail.key)) {
                m.remove(tail.key);
            }
            tail = tail.next;
            tail.prev = null;
        }
           // ListNode temp = tail;
        // while(temp!=null) {
            // System.out.print(temp.key + "=" + temp.val + "," + (temp.prev!=null?temp.prev.key:"#") + " ");
            // temp = temp.next;
        // }
        // System.out.println();
    }
           
           
           
    private ListNode reset(int key) {
        ListNode temp = m.get(key);
        if (temp.next!= null) {
            if (temp.prev!=null)
                temp.prev.next = temp.next;
            else
                tail = tail.next;
            if (head.prev == temp) {
                head.prev = temp.prev;
            }
            temp.next.prev = temp.prev;
            head.next = temp;
            temp.prev = head;
            temp.next = null;
            head = temp;
        }
        
        return temp;
    }
}

/**
 * Your LRUCache object will be instantiated and called as such:
 * LRUCache obj = new LRUCache(capacity);
 * int param_1 = obj.get(key);
 * obj.put(key,value);
 */