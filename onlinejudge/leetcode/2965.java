class Solution {

    public int[] findMissingAndRepeatedValues(int[][] grid) {
        int[] answer = new int[2];

        int n = grid.length * grid.length;
        Set<Integer> set = new HashSet<>();

        for (int[] arr : grid) {
            for (int i = 0; i < arr.length; i += 1) {
                if (set.contains(arr[i])) {
                    answer[0] = arr[i];
                    break;
                }
                set.add(arr[i]);
            }
        }

        for (int i = 1; i <= n; i += 1) {
            if (!set.contains(i)) {
                answer[1] = i;
                break;
            }
        }
        return answer;
    }
}
