import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        boolean[] arr = new boolean[31];
        for (int i = 0; i < 28; i++) {
            int n = Integer.parseInt(scan.nextLine());
            arr[n] = true;
        }

        for (int i = 1; i <=30; i++) {
            if (!arr[i]){
                System.out.println(i);
            }
        }
    }
}