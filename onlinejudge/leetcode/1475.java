class Solution {
    public int[] finalPrices(int[] prices) {
        int n = prices.length;
        Stack<Integer> stack = new Stack<>();

        for (int i = n - 1; i >= 0; i -= 1) {
            while( !stack.isEmpty() && stack.peek() > prices[i]){
                stack.pop();
            }
            
            int discount = stack.isEmpty() ? 0 : stack.peek();
            
            stack.push(prices[i]);
            prices[i] -= discount;           
        }

        return prices;
    }
}
