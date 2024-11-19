class Solution {
    public int[] decrypt(int[] code, int k) {
        if (k > 0) {
            return getNextKNumbers(code, k);
        }

        if (k < 0) {
            return getPriviousKNumbers(code, k);
        }

        // k == 0;
        int[] answer = new int[code.length];
        for (int i = 0; i < answer.length; i += 1) {
            answer[i] = 0;
        }
        return answer;
    }

    private int[] getNextKNumbers(int[] code, int k) {
        int[] answer = new int[code.length];
        for (int i = 0; i < code.length; i += 1) {
            int element = 0;
            for (int j = 1; j <= k; j += 1) {
                int index = i + j;
                if (index >= code.length) {
                    index -= code.length;
                }
                element += code[index];
            }
            answer[i] = element;
        }
        return answer;
    }


    private int[] getPriviousKNumbers(int[] code, int k) {
        int[] answer = new int[code.length];
        for (int i = 0; i < code.length; i += 1) {
            int element = 0;
            for (int j = 1; j <= k * -1; j += 1) {
                int index = i - j;
                if (index < 0) {
                    index += code.length;
                }
                element += code[index];
            }
            answer[i] = element;
        }
        return answer;
    }
}
