public class Solution {
    public String longestDiverseString(int a, int b, int c) {
        String answer = "";

        String[] strings = {"a", "b", "c"};
        int[] count = {a, b, c};
        
        while (true) {
            int maxIndex = findMaxIndex(count);
            int secondMaxIndex = findSecondIndex(count, maxIndex);
            
            // 세 번 연속 같은 문자 체크
            if (answer.length() >= 2 
                && answer.split("")[answer.length() - 1].equals(strings[maxIndex])
                && answer.split("")[answer.length() - 2].equals(strings[maxIndex])
            ) {
                // 첫 번째로 많이 남은 문자가 3번 연속 나왔으면, 두 번째로 많이 남은 문자를 사용
                if (count[secondMaxIndex] == 0) {
                    break; // 두 번째 문자도 사용할 수 없으면 종료
                }

                answer += strings[secondMaxIndex];
                count[secondMaxIndex]--;
            } else {
                // 그렇지 않으면 첫 번째 문자 사용
                if (count[maxIndex] == 0) {
                    break;
                } 
                answer += strings[maxIndex];
                count[maxIndex]--;
            }
        }
        
        return answer;
    }

    private int findMaxIndex(int[] count) {
        int maxIndex = 0;
        for (int i = 1; i < count.length; i += 1) {
            if (count[i] > count[maxIndex]) {
                maxIndex = i;
            }
        }
        return maxIndex;
    }

    private int findSecondIndex(int[] count, int excludeIndex) {
        int secondMaxIndex = -1;
        for (int i = 0; i < count.length; i += 1) {
            if (i == excludeIndex) {
                continue;
            }

            if (secondMaxIndex == -1 || count[i] > count[secondMaxIndex]) {
                secondMaxIndex = i;
            }
        }
        return secondMaxIndex;
    }
}
