class Solution {
    public boolean isAnagram(String s, String t) {
        Map<Character, Integer> map = new HashMap<>();

        for (Character letter : s.toCharArray()) {
            if (map.containsKey(letter)) {
                map.put(letter, map.get(letter) + 1);
            } else {
                map.put(letter, 1);
            }
        }

        for (Character letter : t.toCharArray()) {
            if (map.containsKey(letter)) {
                map.put(letter, map.get(letter) - 1);
            } else {
                map.put(letter, -1);
            }
        }

        for (var letter : map.keySet()) {
            if (map.get(letter) != 0) {
                return false;
            }
        }

        return true;
    }
}