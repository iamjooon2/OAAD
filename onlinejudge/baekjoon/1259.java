import java.util.*;

public class Main {
    public static void main(final String args[]) {
        Scanner scan = new Scanner(System.in);
        
        while (true) {
            final String number = scan.next();
            final int size = number.length();
            char[] charArray = number.toCharArray();
            if (number.equals("0")) {
                break;
            }
            boolean isPalindrome = true;
            int end = 0;
            if (size % 2 == 0) {
                end = size / 2;
            } else {
                end = (size - 1) / 2;
            }
            for (int i = 0; i < end; i += 1) {
                if (charArray[i] != charArray[size - i - 1]) {
                    isPalindrome = false;
                }
            }
            if (isPalindrome) {
                System.out.println("yes");
            } else {
                System.out.println("no");
            }
        }
        
    }
}