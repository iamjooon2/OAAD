import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        
        var n = scan.nextInt();
        var a = 1;
        var piece = 1;
        
        for (int i = 0; i < n; i += 1) {
            if (i % 2 != 0) {
                a += 1;
            }
            piece += a;
        }
        System.out.println(piece);
    }
}