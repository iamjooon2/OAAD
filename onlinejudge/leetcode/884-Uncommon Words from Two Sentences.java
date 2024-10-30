class Solution {
    public String[] uncommonFromSentences(String s1, String s2) {
        Map<String, Integer> map = new HashMap<>();

        for (String s1word : s1.split(" ")) {
            map.put(s1word, map.getOrDefault(s1word, 0) + 1);
        }

        for (String s2word : s2.split(" ")) {
            map.put(s2word, map.getOrDefault(s2word, 0) + 1);
        }

        List<String> uncommonWords = map.keySet()
            .stream()
            .filter(key -> map.get(key) == 1)
            .collect(Collectors.toList());
        
        String[] answer = new String[uncommonWords.size()];
        for (int i = 0; i < uncommonWords.size(); i += 1) {
            answer[i] = uncommonWords.get(i);
        }
        return answer;
    }
}

