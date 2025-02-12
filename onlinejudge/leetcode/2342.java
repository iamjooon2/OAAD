class Solution {
    public int maximumSum(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        int answer = -1;

        for (int num : nums) {
            int digitSum = getDigitSum(num);

            if (map.containsKey(digitSum)) {
                answer = Math.max(answer, num + map.get(digitSum));                
                map.put(digitSum, Math.max(map.get(digitSum), num));
            } else {
                map.put(digitSum, num);
            }
        }

        return answer;
    }

    private int getDigitSum(int num) {
        int sum = 0;
        while (num > 0) {
            sum += num % 10;
            num /= 10;
        }
        return sum;
    }
}
