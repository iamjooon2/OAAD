class Solution {
    public int solution(String dartResult) {
        int answer = 0;
        int[] dart = new int[3];
        int dartIndex = 0;
        int starCount = 0;
        
        String[] input = dartResult.split("");
        for (int i = 0; i < input.length; i += 1) {
            if (input[i].equals("S")) {
                int score = Integer.valueOf(input[i - 1]);
                if (i >= 2 && score == 0 && "1".equals(input[i-2])) {
                    score = 10;
                }
                dart[dartIndex] = score;
                dartIndex++;
            }
            else if (input[i].equals("D")) {
                int score = Integer.valueOf(input[i - 1]);
                if (i >= 2 && score == 0 && "1".equals(input[i-2])) {
                    score = 10;
                }
                score *= score;
                dart[dartIndex] = score;
                dartIndex++;
            }
            else if (input[i].equals("T")) {
                int score = Integer.valueOf(input[i - 1]);
                if (i >= 2 && score == 0 && "1".equals(input[i-2])) {
                    score = 10;
                }
                score = score * score * score;
                dart[dartIndex] = score;
                dartIndex++;
            }
            else if (input[i].equals("*")) {
                int targetIndex = dartIndex - 1;
                dart[targetIndex] *= 2;
                
                if (targetIndex >= 1) {
                    dart[targetIndex - 1] *= 2;
                }
                
                starCount++;
            }
            else if (input[i].equals("#")) {
                int targetIndex = dartIndex - 1;
                dart[targetIndex] *= -1;
            }
        }
        
        for (int score : dart) {
            System.out.println(score);
            answer += score;
        }
        
        return answer;
    }
}
