class Solution {

    static final int MOD = 1_000_000_007;

    public int solution(int n) {
        int answer = 0;
        
        int[] arr = new int[n];
        arr[0] = 1;
        arr[1] = 2;
        
        for (int i = 2; i < n; i++) {
            int num = arr[i - 1] + arr[i - 2];
            arr[i] = num % MOD;
        }
        
        return arr[n-1];
    }
}