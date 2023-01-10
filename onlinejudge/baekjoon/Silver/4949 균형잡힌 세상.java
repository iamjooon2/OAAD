import java.util.Scanner;
import java.util.Stack;

class Main {
    private static final String DOT = ".";
    private static final Character ROUND_BRACKET_INIT = '(';
    private static final Character ROUND_BRACKET_END = ')';
    private static final Character SQUARE_BRACKET_INIT = '[';
    private static final Character SQUARE_BRACKET_END = ']';
    private static final String YES = "yes";
    private static final String NO = "no";


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        while (true) {
            String string = scan.nextLine();
            if (string.equals(DOT)) {
                break;
            }
            System.out.println(check(string));
        }

    }

    public static String check(String string) {
        Stack<Character> bracketStack = new Stack<>();
        for (Character c : string.toCharArray()) {
            if (c.equals(SQUARE_BRACKET_INIT) || c.equals(ROUND_BRACKET_INIT)) {
                bracketStack.push(c);
            }
            if (c.equals(SQUARE_BRACKET_END)) {
                if (bracketStack.empty() || bracketStack.peek() != SQUARE_BRACKET_INIT) {
                    return NO;
                } else {
                    bracketStack.pop();
                }
            }
            if (c.equals(ROUND_BRACKET_END)) {
                if (bracketStack.empty() || bracketStack.peek() != ROUND_BRACKET_INIT) {
                    return NO;
                } else {
                    bracketStack.pop();
                }
            }
        }

        if (bracketStack.empty()) {
            return YES;
        }
        return NO;
    }
}