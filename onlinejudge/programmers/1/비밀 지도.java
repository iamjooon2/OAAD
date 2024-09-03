class Solution {
    public String[] solution(int n, int[] arr1, int[] arr2) {
        String[] answer1 = new String[n];
        String[] answer2 = new String[n];

        String[] result = new String[n];

        for (int i = 0; i < n; i += 1) {
            answer1[i] = decimalToBinary(arr1[i], n);
            answer2[i] = decimalToBinary(arr2[i], n);
        }

        for (int i = 0; i < n; i += 1) {
            result[i] = match(answer1[i], answer2[i]);
        }
        return result;
    }

    private String decimalToBinary(int decimal, int n) {
        String binaryString = Integer.toBinaryString(decimal);
        if (binaryString.length() < n) {
            String box = "0".repeat(n - binaryString.length());
            binaryString = box + binaryString;
        } else if (binaryString.length() > n) {
            binaryString = binaryString.substring(0, n - 1);
        }
        
        return binaryString;
    }

    private String match(String element1, String element2) {
        String answer = "";
        String[] input1 = element1.split("");
        String[] input2 = element2.split("");
        
        for (int i = 0; i < element1.length(); i += 1) {
            if (input1[i].equals("0") && input2[i].equals("0")) {
                answer += " ";
            } else {
                answer += "#";
            }
        }
        
        return answer;
    }
}
