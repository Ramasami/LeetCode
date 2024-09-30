class RandomizedSet {
    
    private Random rand;
    private Set<Integer> numbers;

    public RandomizedSet() {
        rand = new Random();
        numbers = new HashSet<>();
    }
    
    public boolean insert(int val) {
        return numbers.add(val);
    }
    
    public boolean remove(int val) {
        return numbers.remove(val);
    }
    
    public int getRandom() {
        int i = rand.nextInt(numbers.size());
        return (int)numbers.toArray()[i];
    }
}

/**
 * Your RandomizedSet object will be instantiated and called as such:
 * RandomizedSet obj = new RandomizedSet();
 * boolean param_1 = obj.insert(val);
 * boolean param_2 = obj.remove(val);
 * int param_3 = obj.getRandom();
 */