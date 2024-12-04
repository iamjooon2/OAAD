class Solution {
    public boolean canMakeSubsequence(String str1, String str2) {
        int i1 = 0;
        int i2 = 0;

        while (i1 < str1.length() && i2 < str2.length()) {
            char c1 = str1.charAt(i1);
            char c2 = str2.charAt(i2);

            if (c1 == c2 || move(c1) == c2) {
                i2 += 1;
            }
            i1 += 1;
        }

        return i2 == str2.length();
    }

    private char move(char letter) {
        if (letter == 'z') {
            return 'a';
        }
        return (char) (letter + 1);
    }
}
