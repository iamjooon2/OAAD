import java.util.Scanner;

public class SelectionSort{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        int[] arr = new int[10];
        System.out.printf("숫자 10개를 입력하세요: ");

        for (int i=0; i<arr.length; i+=1){
            arr[i] = scan.nextInt();
        }

        selectionSort(arr, arr.length);

        System.out.print("선택 정렬 완료!: ");
        for (int i=0; i<arr.length; i+=1){
            System.out.print(arr[i] + " ");
        }
    }

    public static void selectionSort(int[] arr, int n){
        for (int i=n; i>0; i-=1){
            int k = theLargest(arr, i);
            int tmp = arr[i-1];
            arr[i-1] = arr[k];
            arr[k] = tmp;
        }
    }

    public static int theLargest(int[] arr, int last){
        int largestIdx = last-1;
        for (int j=0; j<last; j+=1){
            if (arr[j] > arr[largestIdx]){
                largestIdx = j;
            }
        }
        return largestIdx;
    }
}