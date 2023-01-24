import java.util.Arrays;
import java.util.Scanner;
/*
 * 동네 편의점의 주인인 동빈이는 N개의 동전을 가지고 있습니다
 * 이때 N개의 동전을 이용하여 만들 수 없는 양의 점수 금액 중 최솟값을 구하는 프로그램을 작성하시오
 *
 * 예를 들어, N = 5이고, 각 동전이 각각 3원, 2원, 1원, 1원, 9원(화폐 단위) 동전이라고 가정합시다.
 * 이때 동빈이가 만들 수 없는 양의 정수 금액 중 최솟값은 8원입니다
 *
 * 또 다른 예시로, N = 3이고 각 동전이 각각 3원, 5원, 7원짜리(화폐 단위) 동전이라고 가정합시다
 * 이때 동빈이가 만들 수 없는 양의 정수 금액 중 최솟값은 1원입니다.
 *
 * */

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int number = scan.nextInt();
        int[] arr = new int[number];
        for (int i = 0; i < number; i++) {
            arr[i] = scan.nextInt();
        }
        Arrays.sort(arr);

        int target = 1;
        for (int i = 0; i < number; i++) {
            if (target < arr[i]) {
                break;
            }
            target += arr[i];
        }
        System.out.println(target);
    }
}