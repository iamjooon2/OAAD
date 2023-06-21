class Solution {
    public String solution(int[] food) {
        String answer = "";
        
        for (int i=1; i<food.length; i++) {
            for (int j=0; j<food[i]/2; j++) {
                answer += Integer.toString(i);
            }
        }
        
        var sb = new StringBuilder(answer).reverse();
        
        return answer + "0" + sb.toString();
    }
}
