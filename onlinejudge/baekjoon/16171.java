import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {

    static final List<String> numbers = List.of("1", "2", "3", "4", "5", "6", "7", "8", "9", "0");;

    public static void main(String[] args) {
        var scan = new Scanner(System.in);

        String s = scan.next();
        String k = scan.next();

        String answer = "";

        List<String> sLines = Arrays.stream(s.split(""))
                .collect(Collectors.toList());

        for (final String sLine : sLines) {
            if (numbers.contains(sLine)) {
                continue;
            } else {
                answer += sLine;
            }
        }

        if (answer.contains(k)) {
            System.out.println(1);
        } else {
            System.out.println(0);
        }
    }
}