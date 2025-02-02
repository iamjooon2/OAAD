class Solution {
    public int[] solution(int n, int s) {
        if (n > s) {
            return new int[]{-1};
        } else if (n == s) {
            int[] arr = new int[n];
            for (int i = 0; i < n; i += 1) {
                arr[i] = 1;
            }
            return arr;
        }
        
        int[] answer = new int[n];
        for (int i = 0; i < n; i += 1) {
            answer[i] = s / n;
        }

        int 나머지 = s % n;
        for (int i = answer.length - 1; i >= n - 나머지; i -= 1) {
            answer[i] += 1;
        }
        
        return answer;
    }
}
