class RandomizedSet {
    
    private Random rand;
    private Map<Integer, Integer> index;
    private List<Integer> numbers;

    public RandomizedSet() {
        rand = new Random();
        numbers = new ArrayList<>();
        index = new HashMap<>();
    }
    
    public boolean insert(int val) {
        if (index.containsKey(val))
            return false;
        index.put(val, numbers.size());
        numbers.add(numbers.size(), val);
        return true;
    }
    
    public boolean remove(int val) {
        if (!index.containsKey(val))
            return false;
        
        int lastElement = numbers.get(numbers.size() - 1);
        int idx = index.get(val);
        numbers.set(idx, lastElement);
        index.put(lastElement, idx);
        numbers.remove(numbers.size() - 1);
        index.remove(val);
        return true;
    }
    
    public int getRandom() {
        return numbers.get(rand.nextInt(numbers.size()));
    }
}

/**
 * Your RandomizedSet object will be instantiated and called as such:
 * RandomizedSet obj = new RandomizedSet();
 * boolean param_1 = obj.insert(val);
 * boolean param_2 = obj.remove(val);
 * int param_3 = obj.getRandom();
 */