class Solution {
    public int singleNumber(int[] nums) {
        int answer = 0;
        Map<Integer, Integer> counts = new HashMap<>();

        for (int num : nums) {
            if (counts.containsKey(num)) {
                counts.put(num, counts.get(num) + 1);
            } else {
                counts.put(num, 1);
            }
        }

        for (var entry : counts.entrySet()) {
            if (entry.getValue() == 1) {
                answer = entry.getKey();
            }
        }
        return answer;
    }
}
