class Solution {
    public int maxProfit(int[] prices) {
        int maxProfit = 0;
        int minPrice = Integer.MAX_VALUE;

        for (int price : prices) {
            minPrice = Math.min(minPrice, price);
            maxProfit = Math.max(maxProfit, price - minPrice);
        }

        return maxProfit;
    }
}

// 시간복잡도 초과
// class Solution {
//     public int maxProfit(int[] prices) {
//         int max = 0;
//         for (int i = 0; i < prices.length; i++) {
//             for (int j = i + 1; j < prices.length; j++) {
//                 max = Math.max(prices[j] - prices[i], max);
//             }
//         }
//         return max;
//     }
// }