import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String line = scan.nextLine();
        String[] words = line.split(" ");
        
        if (words.length == 0) {
            System.out.println(0);
        } else if (words[0] == "") {
            System.out.println(words.length - 1);
        } else {
            System.out.println(words.length);
        }
    }
}
