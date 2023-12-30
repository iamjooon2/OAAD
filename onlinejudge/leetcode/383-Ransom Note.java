class Solution {
    
    public boolean canConstruct(String ransomNote, String magazine) {

        Map<Character, Integer> map = new HashMap<>();

        for (Character word : magazine.toCharArray()) {
            if (map.containsKey(word)) {
                map.put(word, map.get(word) + 1);
            } else {
                map.put(word, 1);
            }
        }

        for (Character word : ransomNote.toCharArray()) {
            if (map.containsKey(word)) {
                map.put(word, map.get(word) - 1);
            } else {
                map.put(word, -1);
            }
        }

        for (var word : map.keySet()) {
            if (map.get(word) < 0) {
                return false;
            }
        }

        return true;
    }
        
}