class ProductOfNumbers {

    private List<Integer> arr = new ArrayList<>();
    private int prod = 1;

    public void add(int num) {
        if (num == 0) {
            arr = new ArrayList<>();
            prod = 1;
            return;
        }
        prod *= num;
        arr.add(prod);
    }
    
    public int getProduct(int k) {
        if (arr.size() < k) {
            return 0;
        }

        int answer = arr.get(arr.size() - 1);
        if (arr.size() == k) {
            return answer;
        }
        return answer / arr.get(arr.size() - 1 - k);
    }
}

/**
 * Your ProductOfNumbers object will be instantiated and called as such:
 * ProductOfNumbers obj = new ProductOfNumbers();
 * obj.add(num);
 * int param_2 = obj.getProduct(k);
 */
