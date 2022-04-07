import java.util.Scanner;

public class QuickSort {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        int[] arr = new int[10];
        System.out.printf("숫자 10개를 입력하세요: ");
        for (int i=0; i<arr.length; i+=1){
            arr[i] = scan.nextInt();
        }

        quickSort(arr, arr[0], arr[arr.length-1]);

        System.out.printf("퀵 정렬 완료!: ");
        for (int i=0; i<arr.length; i+=1){
            System.out.print(arr[i] + " ");
        }
    }

    public static void quickSort(int[] arr, int p, int r){
        if (p < r){
            int q = partition(arr, p, r);
            quickSort(arr, p, q);
            quickSort(arr, q+1, r);
        }
    }

    public static int partition(int[] arr, int p, int r){
        int x = arr[r];
        int i = p-1;
        for (int j = 0; j<p; j+=1){
            if (arr[j] <= x){
                i += 1;
                int tmp1 = arr[j];
                arr[i] = arr[j];
                arr[j] = tmp1;
            }
        }
        int tmp2 = arr[i+1];
        arr[r] = arr[i+1];
        arr[i+1] = tmp2;

        return i + 1;
    }
}
