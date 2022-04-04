import java.util.Scanner;

public class BubbleSort {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        int[] arr = new int[10];
        System.out.printf("숫자 10개를 입력하세요: ");

        for (int i=0; i<arr.length; i+=1){
            arr[i] = scan.nextInt();
        }

        bubbleSort(arr, arr.length);

        System.out.print("버블 정렬 완료!: ");
        for (int i=0; i<arr.length; i+=1){
            System.out.print(arr[i] + " ");
        }
    }

    public static void bubbleSort(int[] arr, int n){
        for (int i=0; i<n; n-=1){
            for (int j=0; j<n-1; j+=1){
                if (arr[j]> arr[j+1]){
                    int tmp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = tmp;
                }
            }
        }
    }
}
