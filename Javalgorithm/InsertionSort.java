import java.util.Random;

public class InsertionSort {
    public static void main(String[] args) {
        Random random = new Random();
        int[] arr = new int[10];

        int max = 99;
        int min = 10;
        arr[0] = 9;
        for (int i=1; i<arr.length; i+=1){
            arr[i] = random.nextInt(max-min) + min;
        }

        System.out.printf("랜덤으로 생성된 배열: ");
        for (int i=0; i<arr.length; i+=1){
            System.out.print(arr[i] + " ");
        }
        System.out.println();

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
