class Solution {
    public int countPrefixSuffixPairs(String[] words) {
        int answer = 0;
        for (int i = 0; i < words.length; i += 1) {
            for (int j = i + 1; j < words.length; j += 1) {
                if (isPrefixAndSuffix(words[i], words[j])) {
                    answer += 1;
                }
            }
        }
        return answer;
    }


    private boolean isPrefixAndSuffix(String str1, String str2) {
        if (str1.length() > str2.length()) {
            return false;
        }
        return str2.startsWith(str1) && str2.endsWith(str1);
    }
}
