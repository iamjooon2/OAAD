class Solution {
    public int findDuplicate(int[] nums) {
        int answer = 0;
        Map<Integer, Integer> map = new HashMap<>();
        for (int num : nums) {
            if (map.containsKey(num)) {
                answer = num;
            } else {
                map.put(num, num);
            }
        }
        return answer;
    }
}
