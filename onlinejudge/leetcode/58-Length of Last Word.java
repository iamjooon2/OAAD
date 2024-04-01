class Solution {
    public int lengthOfLastWord(String s) {
        return new StringBuilder(s.trim())
        .reverse()
        .toString()
        .split(" ")[0]
        .length();    
    }
}
