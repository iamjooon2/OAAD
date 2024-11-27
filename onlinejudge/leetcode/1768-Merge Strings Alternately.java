class Solution {
    public String mergeAlternately(String word1, String word2) {
        char[] word1Char = word1.toCharArray();
        char[] word2Char = word2.toCharArray();

        int longStringIndex = Math.max(word1.length(), word2.length());
        int shortStringIndex = Math.min(word1.length(), word2.length());

        boolean isWord1Long = word1.length() > word2.length() ? true : false;

        List<Character> arr = new ArrayList<>();
        for (int i = 0; i < shortStringIndex; i += 1) {
            arr.add(word1Char[i]);
            arr.add(word2Char[i]);
        }

        for (int i = shortStringIndex; i < longStringIndex; i += 1) {
            if (isWord1Long) {
                arr.add(word1Char[i]);
            } else {
                arr.add(word2Char[i]);
            }
        }


        char[] answer = new char[arr.size()];
        for (int i = 0 ; i < answer.length; i += 1) {
            answer[i] = arr.get(i);
        }
        return new String(answer);
    }
}


// Solution (using two-pointer)
// public String mergeAlternately(String word1, String word2) {
//     StringBuilder result = new StringBuilder();
//     int i = 0;
//     while (i < word1.length() || i < word2.length()) {
//         if (i < word1.length()) {
//             result.append(word1.charAt(i));
//         }
//         if (i < word2.length()) {
//             result.append(word2.charAt(i));
//         }
//         i++;
//     }
//     return result.toString();
// }