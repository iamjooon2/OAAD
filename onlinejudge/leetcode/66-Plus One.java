import java.math.*;

class Solution {
    public int[] plusOne(int[] digits) {
        String temp = "";
        for (int num : digits) {
            var string = String.valueOf(num);
            temp += string;
        }

        BigInteger max = new BigInteger(temp).add(new BigInteger("1"));
        String outputString =  String.valueOf(max);
        String[] split = outputString.split("");

        int[] answer = new int[split.length];
        for (int i = 0; i < answer.length; i += 1) {
            answer[i] = Integer.valueOf(split[i]);
        }

        return answer;
    }
}
