class Solution {
    public int numRabbits(int[] answers) {
        Map<Integer, Integer> count = new HashMap<>();
        for (int answer : answers) {
            count.put(answer, count.getOrDefault(answer, 0) + 1);
        }
        
        int answer = 0;
        for (Map.Entry<Integer, Integer> entry : count.entrySet()) {
            int x = entry.getKey();
            int cnt = entry.getValue();

            int groups = (cnt + x) / (x + 1);
            answer += groups * (x + 1);
        }
        return answer;
    }
}
