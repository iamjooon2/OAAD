class Solution {
    public String solution(int a, int b) {
        String[] date = {"FRI", "SAT", "SUN", "MON", "TUE", "WED", "THU"};
        int[] days = {31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

        int total = 0;
        for (int i = 0; i < a - 1; i += 1) {
            total += days[i];
        }
        // 1월 1일도 하루 지난 것으로 쳐서 그거 방지하려고 하나 빼 줌
        total += b - 1;
        int index = total % 7;
        return date[index];
    }
}