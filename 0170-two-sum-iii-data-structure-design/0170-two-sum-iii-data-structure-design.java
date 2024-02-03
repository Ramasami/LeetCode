class TwoSum {
    
    Map<Integer,Boolean> set;

    public TwoSum() {
        set = new HashMap<>();
    }
    
    public void add(int number) {
        set.computeIfPresent(number, (k,v)->true);
        set.putIfAbsent(number, false);
    }
    
    public boolean find(int value) {
        for(Integer i:set.keySet()) {
            if(i == value-i && set.get(i))
                return true;
            else if(i != value-i && set.containsKey(value-i))
                return true;
        }
        return false;
    }
}

/**
 * Your TwoSum object will be instantiated and called as such:
 * TwoSum obj = new TwoSum();
 * obj.add(number);
 * boolean param_2 = obj.find(value);
 */