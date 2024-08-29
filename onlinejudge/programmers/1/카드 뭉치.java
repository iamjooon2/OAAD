class Solution {
    public String solution(String[] cards1, String[] cards2, String[] goal) {
        int cards1Index = 0;
        int cards2Index = 0;
        
        for (String word : goal) {
            if (cards1Index <= cards1.length - 1 && cards1[cards1Index].equals(word)) {
                cards1Index += 1;
                continue;
            }
            else if (cards2Index <= cards2.length - 1 && cards2[cards2Index].equals(word)) {
                cards2Index += 1;
                continue;
            } else {
                return "No";
            }
        }
        
        return "Yes";
    }
}
