public class Solution {
    public String reverseWords(String s) {
        String[] words = s.trim().split("\\s+"); // \\s+는 하나 이상의 공백을 의미
        
        StringBuilder result = new StringBuilder();
        for (int i = words.length - 1; i >= 0; i -= 1) {
            result.append(words[i]);
            if (i > 0) {
                result.append(" ");
            }
        }
        
        return result.toString();
    }
}


// 손ㅗ딩
public class Solution {
    public String reverseWords(String s) {
        List<Character> result = new ArrayList<>();
        char[] arr = s.trim().toCharArray();

        boolean wasBlank = false;
        for (int i = 0; i < arr.length; i += 1) {
            boolean isBlank = ' ' == arr[i];
            
            if (wasBlank && isBlank) {
                continue;
            }

            result.add(arr[i]);

            wasBlank = isBlank;
        }

        String sentence = "";
        for (int i = 0; i < result.size(); i += 1) {
            sentence += String.valueOf(result.get(i));
        }

        List<String> answer = Arrays.stream(sentence.split(" "))
            .collect(Collectors.toList());

        Collections.reverse(answer);

        return answer.stream()
            .collect(Collectors.joining(" "));
    }
}
