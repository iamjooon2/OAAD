import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int A = scan.nextInt();
        int B = scan.nextInt();

        Set<Integer> setA = new HashSet<>();
        Set<Integer> setB = new HashSet<>();

        for (int i = 0; i < A; i++) {
            setA.add(scan.nextInt());
        }

        for (int i = 0; i < B; i++) {
            setB.add(scan.nextInt());
        }

        int resultA = setA.size();
        for (int element : setA) {
            if (setB.contains(element)) {
                resultA--;
            }
        }

        int resultB = setB.size();
        for (int element : setB) {
            if (setA.contains(element)) {
                resultB--;
            }
        }

        System.out.println(resultA + resultB);
    }
}
