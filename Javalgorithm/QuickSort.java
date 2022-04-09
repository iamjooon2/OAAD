import java.util.Random;

public class QuickSort {

    public static void main(String[] args) {
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

        quickSort(arr, 0, arr.length-1);

        System.out.print("퀵 정렬 완료!: ");
        for (int i=0; i<arr.length; i+=1){
            System.out.print(arr[i] + " ");
        }
    }

    public static void quickSort(int[] arr, int p, int r){
        if (p < r){
            int q = partition(arr, p, r);
            quickSort(arr, p, q-1);
            quickSort(arr, q+1, r);
        }
    }

    public static int partition(int[] arr, int p, int r){
        int x = arr[r];
        int i = p-1;
        for (int j=p; j<r; j+=1){
            if (arr[j] <= x){
                i += 1;
                int tmp1 = arr[i];
                arr[i] = arr[j];
                arr[j] = tmp1;
            }
        }
        //arr[i+1]과 arr[r]을 교환한다
        int tmp2 = arr[r];
        arr[r] = arr[i+1];
        arr[i+1] = tmp2;

        return i + 1;
    }
}