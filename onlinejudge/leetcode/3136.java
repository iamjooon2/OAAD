class Solution {

    static final List<String> VOWELS = List.of(
        "a", "e", "i", "o", "u" 
    );
    static final String CONSONANTS = "bcdfghjklmnpqrstvwxyz"; 
    static final String NUMBERS = "1234567890";

    public boolean isValid(String word) {
        String[] arr = word.split("");

        if (arr.length < 3) {
            return false;
        }

        boolean hasVowel = false;
        boolean hasConsonant = false;

        for (String s : arr) {
            if (isNotVowel(s) && isNotConsonant(s) && isNotNumber(s)) {
                return false;
            }
            
            if (isConsonant(s)) {
                hasConsonant = true;
            } else if (isVowel(s)) {
                hasVowel = true;
            }
        }

        return hasConsonant && hasVowel;
    }

    private boolean isNotNumber(String s) {
        return !NUMBERS.contains(s);
    }

    private boolean isVowel(String s) {
        return VOWELS.contains(s.toLowerCase());
    }

    private boolean isNotVowel(String s) {
        return !isVowel(s);
    }

    private boolean isConsonant(String s) {
        return CONSONANTS.contains(s.toLowerCase());
    }

    private boolean isNotConsonant(String s) {
        return !isConsonant(s);
    }
}
