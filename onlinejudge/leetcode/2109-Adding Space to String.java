class Solution {

    public String addSpaces(String s, int[] spaces) {
        var answer = new StringBuilder();

        int index = 0;
        for (int i = 0; i < s.length(); i += 1){
            if (index < spaces.length && i == spaces[index]){
                answer.append(" ");
                index += 1;
            }
            answer.append(s.charAt(i));
        }
        return answer.toString();
    }
}

