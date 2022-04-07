import java.util.Scanner;

public class InsertionSort {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        int[] arr = new int[10];
        System.out.printf("숫자 10개를 입력하세요: ");
        for (int i=0; i<arr.length; i+=1){
            arr[i] = scan.nextInt();
        }

        insertionSort(arr, arr.length);

        System.out.printf("삽입 정렬 완료!: ");
        for (int i=0; i<arr.length; i+=1){
            System.out.print(arr[i] + " ");
        }
    }

    public static void insertionSort(int[] arr, int n){
        //a[0]은 정렬되어있다고 가정, arr[1]과 arr[2] 비교부터 시작
        for (int i=2; i<n; i+=1){
            int loc = i-1;
            int newItem = arr[i];
            while (loc>=1 && newItem < arr[loc]){
                arr[loc+1] = arr[loc];
                loc-=1;
            }
            arr[loc+1] = newItem;
        }
    }
}
