class Solution {

     public int minLength(String s) {
        Stack<Character> stack = new Stack<>();

        char[] arr = s.toCharArray();
        stack.push(arr[0]);

        for (int i = 1; i < arr.length; i += 1) {
            char element = arr[i];

            if (element == 'B' && stack.peek() == 'A') {
                stack.pop();
            }
            else if (element == 'D' && stack.peek() == 'C') {
                stack.pop();
            }
            else {
                stack.push(element);
            }
        }

        return stack.size();
    }
}
