class Solution {
    public int strStr(String haystack, String needle) {
        int len = needle.length();

        for (int i = 0; i < haystack.length() - len + 1; i += 1) {
            String s = haystack.substring(i, len + i);

            if (s.equals(needle)) {
                return i;
            }
        }

        return -1;
    }
}
