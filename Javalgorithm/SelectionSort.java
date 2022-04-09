import java.util.Random;

public class SelectionSort{
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

        selectionSort(arr, arr.length);

        System.out.print("선택 정렬 완료!: ");
        for (int i=0; i<arr.length; i+=1){
            System.out.print(arr[i] + " ");
        }
    }

    public static void selectionSort(int[] arr, int n){
        for (int i=0; i<n; n-=1){
            int k = theLargest(arr, n);
            int tmp = arr[n-1];
            arr[n-1] = arr[k];
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