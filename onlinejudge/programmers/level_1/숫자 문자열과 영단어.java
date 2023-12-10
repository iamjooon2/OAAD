class Solution {
    static final String[] targets = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
    
    public int solution(String input) {
        
        for (int i = 0; i < 10; i += 1) {
            input = input.replaceAll(targets[i], String.valueOf(i));
        }
        
        return Integer.parseInt(input);
    }
}