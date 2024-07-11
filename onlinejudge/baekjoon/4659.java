import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {

    static final Scanner scan = new Scanner(System.in);

    static final List<String> VOWELS = List.of(
            "a", "e", "i", "o", "u"
    );

    public static void main(String[] args) {
        while (true) {
            String input = scan.nextLine();
            if (input.equals("end")) {
                break;
            }

            List<String> password = Arrays.asList(input.split(""));
            printAnswer((isAcceptable(password)), input);
        }
    }

    private static boolean isAcceptable(List<String> password) {
        if (hasNotVowel(password)) return false;

        if (hasContinualThreeLetters(password)) return false;

        if (hasContinualSameLetter(password)) return false;

        return true;
    }

    private static boolean hasContinualSameLetter(List<String> password) {
        for (int i = 0; i < password.size() - 1; i++) {
            String first = password.get(i);
            String second = password.get(i + 1);

            if (first.equals(second)) {
                if (!first.equals("e") && !first.equals("o")) {
                    return true;
                }
            }
        }
        return false;
    }

    private static boolean hasContinualThreeLetters(List<String> password) {
        for (int i = 0; i < password.size() - 2; i++) {
            boolean first = VOWELS.contains(password.get(i));
            boolean second = VOWELS.contains(password.get(i + 1));
            boolean third = VOWELS.contains(password.get(i + 2));

            if (first && second && third) {
                return true;
            }
            if (!first && !second && !third) {
                return true;
            }
        }
        return false;
    }

    private static boolean hasNotVowel(List<String> password) {
        boolean hasNotVowel = !password.stream()
                .anyMatch(VOWELS::contains);
        if (hasNotVowel) {
            return true;
        }
        return false;
    }

    private static void printAnswer(boolean isAcceptable, String input) {
        if (isAcceptable) {
            System.out.println("<" + input + "> is acceptable.");
        } else {
            System.out.println("<" + input + "> is not acceptable.");
        }
    }

}