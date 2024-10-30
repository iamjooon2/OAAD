class Solution {
    public int countWords(String[] words1, String[] words2) {
        Map<String, Integer> map1 = new HashMap<>();
        Map<String, Integer> map2 = new HashMap<>();

        for (String word1 : words1) {
            map1.put(word1, map1.getOrDefault(word1, 0) + 1);
        }

        for (String word2 : words2) {
            map2.put(word2, map2.getOrDefault(word2, 0) + 1);
        }

        List<String> filtered = map1.keySet()
            .stream()
            .filter(key -> map1.getOrDefault(key, Integer.MAX_VALUE) == 1)
            .collect(Collectors.toList());

        return map2.keySet()
            .stream()
            .filter(it -> map2.getOrDefault(it, Integer.MAX_VALUE) == 1 && filtered.contains(it))
            .collect(Collectors.toList())
            .size();
    }
}
