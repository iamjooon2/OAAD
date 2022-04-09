import java.util.Random;

public class MergeSort {

    public static int[] tmp = new int[10];
    public static void main(String[] args){
        Random random = new Random();
        int[] arr = new int[10];

        int max = 99;
        int min = 10;
        for (int i=0; i<arr.length; i+=1){
            arr[i] = random.nextInt(max-min) + min;
        }

        System.out.printf("랜덤으로 생성된 배열: ");
        for (int i=0; i<arr.length; i+=1){
            System.out.print(arr[i] + " ");
        }
        System.out.println();

        mergeSort(arr, 0, arr.length-1);

        System.out.print("병합 정렬 완료!: ");
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
        while (i<=q && j<=r){
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