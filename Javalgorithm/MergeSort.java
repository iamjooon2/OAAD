import java.util.Scanner;

public class MergeSort {

    public static int[] tmp;
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        int[] arr = new int[10];
        tmp = new int[arr.length];
        System.out.printf("숫자 10개를 입력하세요: ");
        for (int i=0; i<arr.length; i+=1) {
            arr[i] = scan.nextInt();
        }

        mergeSort(arr, 0, arr.length-1);

        System.out.printf("병합 정렬 완료!: ");
        for (int i=0; i<arr.length; i+=1){
            System.out.print(arr[i] + " ");
        }
    }

    public static void mergeSort(int[] arr, int start, int end){
        if (start < end){
            int mid = (start + end)/2;
            mergeSort(arr, start, mid);
            mergeSort(arr,mid+1, end);
            merge(arr, start, mid, end);
        }
    }

    public static void merge(int[] arr, int p, int q, int r){
        int i = p;
        int j = q+1;
        int k = p;
        while (i <= q && j <= r){
            if (arr[i] <= arr[j]){
                tmp[k] = arr[i];
                k += 1;
                i += 1;
            } else{
                tmp[k] = arr[j];
                k += 1;
                j += 1;
            }
        }
        //남은 데이터 삽입
        while (i<=q){
            tmp[k] = arr[i];
            k += 1;
            i += 1;
        }
        while (j <= r){
            tmp[k] = arr[j];
            k += 1;
            j += 1;
        }

        //결과를 arr에 저장
        i = p;
        k = p;
        while (i<=r){
            arr[i] = tmp[k];
            k += 1;
            i += 1;
        }

    }
}
