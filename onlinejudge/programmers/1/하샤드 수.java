class Solution {
    public boolean solution(int x) {
        int answer = 0;
        for (String a : String.valueOf(x).split("") ) {
            answer += Integer.valueOf(a);
        }
        return x % answer == 0;
    }
}