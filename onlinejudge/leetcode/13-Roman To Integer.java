class Solution {
    static Map<Character, Integer> VALUE = Map.of(
        'I', 1,
        'V', 5,
        'X', 10,
        'L', 50,
        'C', 100,
        'D', 500,
        'M', 1000
    );
    static final int NONE = -1;

    public int romanToInt(String s) {
        char[] arr = s.toCharArray();

        int sum = 0;
        for (int i = 1; i < s.length(); i += 1) {
            int left = VALUE.get(arr[i - 1]);
            int right = VALUE.get(arr[i]);

            if (left < right) {
                sum -= left;
            } else {
                sum += left;
            }
        }
        return sum + VALUE.get(arr[s.length() - 1]);
    }
}

