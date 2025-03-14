class Solution {
    public int maximumCandies(int[] candies, long k) {
        long total = sum(candies);
        if (total < k) {
            return 0;
        }

        int left = 1;
        int right = Arrays.stream(candies).max().getAsInt();

        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (canDistribute(candies, k, mid)) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return right;
    }

    private boolean canDistribute(int[] candies, long k, int pileSize) {
        long count = 0;
        for (int candy : candies) {
            count += candy / pileSize;
            if (count >= k) {
                return true;
            }
        }
        return false;
    }

    private long sum(int[] arr) {
        long total = 0;
        for (int num : arr) {
            total += num;
        }
        return total;
    }
}
