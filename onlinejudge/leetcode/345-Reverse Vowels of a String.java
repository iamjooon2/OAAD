class Solution {

    static final String VOWELS = "aeiouAEIOU";

    public String reverseVowels(String s) {
        char[] words = s.toCharArray();

        int start = 0;
        int end = s.length() - 1;

        while (start < end) {

            while (start < end && VOWELS.indexOf(words[start]) == -1) {
                start++;
            }

            while (start < end && VOWELS.indexOf(words[end]) == -1) {
                end--;
            }

            char temp = words[start];
            words[start] = words[end];
            words[end] = temp;
            
            start += 1;
            end -= 1;
        }

        return new String(words);
    }
}
