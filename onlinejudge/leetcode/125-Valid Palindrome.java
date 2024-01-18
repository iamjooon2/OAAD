class Solution {
    public static boolean isPalindrome(String s) {
        String sentence = s.toLowerCase().replaceAll("[^a-z0-9]", "");

        for (int i = 0; i < sentence.length() / 2; i += 1) {
            if (sentence.charAt(i) != sentence.charAt(sentence.length() - i - 1)) {
                return false;
            }
        }
        return true;
    }
}