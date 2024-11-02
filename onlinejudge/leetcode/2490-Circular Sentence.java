class Solution {
    public boolean isCircularSentence(String sentence) {
        String[] arr = sentence.split(" ");
        
        char firstChar = arr[0].toCharArray()[0];
        String lastString = arr[arr.length - 1];
        char lastChar = lastString.toCharArray()[lastString.length() - 1];

        if (lastChar != firstChar) {
            return false;
        }

        for (int i = 0 ; i < arr.length - 1; i += 1) {
            int currentWordLength = arr[i].length();
            int nextWordLength = arr[i + 1].length();

            char currentWordLastLetter = arr[i].toCharArray()[currentWordLength - 1];
            char nextWordFirstLetter = arr[i + 1].toCharArray()[0];

            if (currentWordLastLetter != nextWordFirstLetter) {
                return false;
            }
        }

        return true;
    }
}
