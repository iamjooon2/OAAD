class Solution {
    public int solution(int n) {
        int[] arr = new int[n + 1];
        arr[0] = 0;
        arr[1] = 1;
        for (int i = 2; i <= n; i += 1) {
            int sum = arr[i - 1] + arr[i - 2];
            arr[i] = sum % 1234567;
        }
        return arr[n] % 1234567;
    }
}
