import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n1 = scan.nextInt();
        scan.nextLine(); // 개행 문자 처리

        int targetIndex = -1;
        List<String> arr = new ArrayList<>();
        for (int i = 0; i < n1; i++) {
            String word = scan.next();
            if (word.equals("?")) {
                targetIndex = i;
            }
            arr.add(word);
        }

        int n2 = scan.nextInt();
        scan.nextLine(); // 개행 문자 처리

        List<String> candidates = new ArrayList<>();
        for (int i = 0; i < n2; i++) {
            candidates.add(scan.next());
        }

        for (String word : candidates) {
            if (arr.contains(word)) {
                continue;
            }

            boolean isValid = true;

            if (targetIndex > 0) { // 앞 단어가 있는 경우
                String before = arr.get(targetIndex - 1);
                char last = before.charAt(before.length() - 1);
                if (word.charAt(0) != last) {
                    isValid = false;
                }
            }

            if (targetIndex < n1 - 1) { // 뒤 단어가 있는 경우
                String after = arr.get(targetIndex + 1);
                char first = after.charAt(0);
                if (word.charAt(word.length() - 1) != first) {
                    isValid = false;
                }
            }

            if (isValid) {
                System.out.println(word);
                break; // 첫 번째로 가능한 단어를 출력 후 종료
            }
        }
    }
}
