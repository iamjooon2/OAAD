class Solution {
    public int longestPalindrome(String s) {
        int count = s.length();

        if (count == 0 || count == 1) {
            return count;
        }

        Map<Character, Integer> map = new HashMap<>();
        char[] arr = s.toCharArray();

        for (char element : arr) {
            if (map.containsKey(element)) {
                map.put(element, map.get(element) + 1);
            } else {
                map.put(element, 1);
            }
        }

        int answer = 0;
        boolean isOdd = false;
    
        for (var element : map.entrySet()) {
            int value = element.getValue();
            if (value % 2 != 0 ) {
                if (isOdd) {
                    if (value > 1) {
                        answer += value - 1;
                    }
                } else {
                    isOdd = true;
                    answer += value;
                }
            } else {
                answer += value;
            }   
        }
    
        return answer;
    }
}