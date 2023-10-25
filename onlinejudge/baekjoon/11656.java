import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String word = scan.next();

        final List<String> answers = new ArrayList<>();
        for (int i = 0; i < word.length(); i++) {
            final String substring = word.substring(i);
            answers.add(substring);
        }

        Collections.sort(answers);
        answers.forEach(System.out::println);
    }
}