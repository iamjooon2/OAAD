import java.util.*;

class Main {
    private static final String YES = "YES";
    private static final String NO = "NO";
    private static final char INIT_BRACKET = '(';

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        scan.nextLine();

        ArrayList<String> lineList = new ArrayList<>();
        for (int i = 0; i < n; i += 1) {
            lineList.add(scan.nextLine());
        }

        for (int i = 0; i < n; i += 1) {
            Stack<Character> stringStack = new Stack<>();

            boolean flag = false;
            String s = lineList.get(i);

            for (int j = 0; j < s.length(); j += 1) {
                char c = s.charAt(j);

                if (c == INIT_BRACKET) {
                    stringStack.push(c);
                } else {
                    if (!stringStack.isEmpty()) {
                        stringStack.pop();
                    } else {
                        flag = true;
                        break;
                    }
                }
            }
            printAnswer(stringStack, flag);
        }
    }

    private static void printAnswer(Stack<Character> stack, boolean flag) {
        if (flag || !stack.isEmpty()) {
            System.out.println(NO);
        } else {
            System.out.println(YES);
        }
    }

}