import java.util.*;

// Me
class Solution {
    public String mergeAlternately(String word1, String word2) {
        String longWord = word1.length() >= word2.length() ? word1 : word2;

        int shortWordLength = Math.min(word1.length(), word2.length());

        List<Character> arr = new ArrayList<>();
        char[] word1Arr = word1.toCharArray();
        char[] word2Arr = word2.toCharArray();
        for (int i = 0; i < shortWordLength; i += 1) {
            arr.add(word1Arr[i]);
            arr.add(word2Arr[i]);
        }

        if (word2.equals(longWord)) {
            for (int i = shortWordLength; i < longWord.length(); i += 1) {
                arr.add(word2Arr[i]);
            }
        } else {
            for (int i = shortWordLength; i < longWord.length(); i += 1) {
                arr.add(word1Arr[i]);
            }
        }

        char[] charAnswer = new char[arr.size()];
        for (int i = 0; i < charAnswer.length; i += 1) {
            charAnswer[i] = arr.get(i);
        }
        return new String(charAnswer);
    }
}

// Solution

class Solution {
    public String mergeAlternately(String word1, String word2) {
        StringBuilder result = new StringBuilder();
        int i = 0;
        while (i < word1.length() || i < word2.length()) {
            if (i < word1.length()) {
                result.append(word1.charAt(i));
            }
            if (i < word2.length()) {
                result.append(word2.charAt(i));
            }
            i++;
        }
        return result.toString();
    }
}