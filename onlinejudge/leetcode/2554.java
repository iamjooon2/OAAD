class Solution {
    public int maxCount(int[] banned, int n, int maxSum) {
        Set<Integer> bannedSet = Arrays.stream(banned)
                                        .boxed()
                                        .collect(Collectors.toSet());

        int total = 0;
        int count = 0;

        for (int i = 1; i <= n; i += 1) {
            if (!bannedSet.contains(i)) {
                total += i;

                if (total <= maxSum) {
                    count += 1;
                } else {
                    break;
                }
            }
        }

        return count;
    }
}