class Solution {
    public long maxMatrixSum(int[][] matrix) {
        long sum = 0;
        int minAbsValue = Integer.MAX_VALUE;
        int negativeCount = 0;

        for (int[] row : matrix) {
            for (int value : row) {
                sum += Math.abs(value);

                minAbsValue = Math.min(minAbsValue, Math.abs(value));

                if (value < 0) {
                    negativeCount += 1;
                }
            }
        }

        if (negativeCount % 2 == 1) {
            sum -= 2 * minAbsValue;
        }

        return sum;
    }
}
