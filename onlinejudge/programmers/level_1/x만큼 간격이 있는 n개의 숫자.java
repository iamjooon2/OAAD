class Solution {
    public long[] solution(int x, int n) {
        long[] answer = new long[n];
        
        for(int i = 0; i < n; i += 1) {
            answer[i] = x * ((long) i + 1); // long 타입 캐스팅 안해주면 오버플로우 남
        }
        
        return answer;
    }
}