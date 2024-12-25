class RandomizedSet {

    final Map<Integer, Integer> map;

    public RandomizedSet() {
        map = new HashMap<>();
    }
    
    public boolean insert(int val) {
        if (map.containsKey(val)) {
            return false;
        }
        map.put(val, 0);
        
        return true;
    }

    public boolean remove(int val) {
        if (map.containsKey(val)) {
            map.remove(val);
            
            return true;
        }

        return false;
    }
    
    public int getRandom() {
        int size = map.size();
        
        List<Integer> keys = map.keySet()
            .stream()
            .collect(Collectors.toList());

        Collections.shuffle(keys);

        return keys.get(0);
    }
}

/**
 * Your RandomizedSet object will be instantiated and called as such:
 * RandomizedSet obj = new RandomizedSet();
 * boolean param_1 = obj.insert(val);
 * boolean param_2 = obj.remove(val);
 * int param_3 = obj.getRandom();
 */
