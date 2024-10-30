public class Solution {
    public int[] arrayRankTransform(int[] arr) {
        if (arr.length == 0) {
            return arr;
        }

        int[] sorted = Arrays.copyOf(arr, arr.length);
        Arrays.sort(sorted);

        Map<Integer, Integer> map = new HashMap<>();
        map.put(sorted[0], 1);

        for (int i = 1; i < sorted.length; i += 1) {
            if (sorted[i] > sorted[i - 1]) {
                map.put(sorted[i], map.get(sorted[i - 1]) + 1);
            } else {
                map.put(sorted[i], map.get(sorted[i - 1]));
            }
        }

        int[] answer = new int[arr.length];
        for (int i = 0; i < arr.length; i += 1) {
            answer[i] = map.get(arr[i]);
        }
        return answer;
    }
}
