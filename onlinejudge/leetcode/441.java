class Solution {
    public int arrangeCoins(int n) {
        int answer = 0;
        int count = 1;

        while (true) {
            n -= count;
            if (n < 0) {
                break;
            }
            count += 1;
            answer += 1;
        }
        
        return answer;
    }
}
