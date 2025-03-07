class Solution {
    public int[] closestPrimes(int left, int right) {
        int[] answer = new int[2];

        List<Integer> arr = new ArrayList<>();
        boolean[] isPrime = getPrimeNumbers(right);
        for (int i = left; i <= right; i += 1) {
            if (isPrime[i]) {
                arr.add(i);
            }
        }

        if (arr.size() < 2) {
            return new int[]{-1, -1};
        }

        int minimumGap = Integer.MAX_VALUE;
        for (int i = 0; i < arr.size() - 1; i += 1) {
            int after = arr.get(i + 1);
            int before = arr.get(i);
            if (after - before < minimumGap) {
                minimumGap = after - before;
                answer[0] = before;
                answer[1] = after;
            }
        }
        return answer;
    }

    private boolean[] getPrimeNumbers(int number) {
        boolean[] isPrime = new boolean[number + 1];
        Arrays.fill(isPrime, true); // 처음에는 모든 수를 소수로 가정
        isPrime[0] = isPrime[1] = false; // 0과 1은 소수가 아님

        for (int i = 2; i * i <= number; i++) {
            if (isPrime[i]) {
                for (int j = i * i; j <= number; j += i) {
                    isPrime[j] = false;
                }
            }
        }
        return isPrime;
    }
}
