class Solution {
    public long solution(int price, int money, int count) {
        long total = 0;
        for (int i = 1; i < count + 1; i += 1) {
            total += (price * i);
        }
        if (total < money) {
            return 0;
        } else {
            return total - money;
        }
    }
}