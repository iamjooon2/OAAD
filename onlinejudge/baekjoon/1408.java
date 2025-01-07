class Solution {
    public List<String> stringMatching(String[] words) {
        List<String> answer = new ArrayList<>();
        for (int i = 0; i < words.length; i += 1) {
            for (int j = i + 1; j < words.length; j += 1) {
                if (words[i].contains(words[j]) && !answer.contains(words[j])) {
                    answer.add(words[j]);
                } else if (words[j].contains(words[i]) && !answer.contains(words[i])) {
                    answer.add(words[i]);
                }
            }
        }
        return answer;       
    }
}
