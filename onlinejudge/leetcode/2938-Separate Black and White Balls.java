class Solution {
    // 1 -> black
    // 0 -> white
    public long minimumSteps(String s) {
        long answer = 0;
        int blacks = 0;

        for (String element : s.split("")) {
            if (element.equals("1")) {
                blacks += 1;
                continue;
            }
            
            if (blacks >= 1 && element.equals("0") ) {
                answer += blacks;
            }
        }

        return answer;
    }
}
