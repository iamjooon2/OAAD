class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        List<Integer> answers = new ArrayList<>();
        Map<Integer, Integer> maps = new HashMap<>();
        for (int num : nums) {
            if (maps.containsKey(num)) {
                answers.add(num);
            } else {
                maps.put(num, num);
            }
        }
        
        return answers;
    }
}
