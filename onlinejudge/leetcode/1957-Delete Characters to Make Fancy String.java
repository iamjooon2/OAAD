class Solution {
    public String makeFancyString(String s) {
        List<Character> dynamicCharArray = new ArrayList<>();
        char[] charArray = s.toCharArray();

        char before = charArray[0];
        dynamicCharArray.add(before);

        int count = 1;
        for (int i = 1; i < charArray.length; i += 1) {
            if (charArray[i] == before) {
                count += 1;
            } else {
                count = 1;
            }

            if (count < 3) {
                dynamicCharArray.add(charArray[i]);
            }
            before = charArray[i];
        }

        char[] answer = new char[dynamicCharArray.size()];
        for (int i = 0; i < answer.length; i += 1) {
            answer[i] = dynamicCharArray.get(i);
        }
        return new String(answer);
    }
}
