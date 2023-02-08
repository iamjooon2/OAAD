import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Stack;
 
public class Main {
    private static final char BRACKET_INIT = '(';
    private static final char BRACKET_END = ')';
    public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        Stack<Character> stack = new Stack<>();
        String input = bf.readLine();
 
        int result = 0;
        for (int i = 0; i < input.length(); i++) {
            if (input.charAt(i) == BRACKET_INIT) {
                stack.push(BRACKET_INIT);
                continue;
            }
            if (input.charAt(i) == BRACKET_END) {
                stack.pop(); 
 
                // 레이저일 때 
                if (input.charAt(i - 1) == BRACKET_INIT) {
                    // 레이저 크기만큼 더해주기
                    result += stack.size();
                // 레이저 아닐 때
                } else {
                    result += 1;
                }
            }
        }
        bw.write(result + "\n");
        bw.flush();
        bf.close();
        bw.close();
    }
 
}