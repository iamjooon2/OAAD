import java.util.Random;

public class BubbleSort {
    public static void main(String[] args){
        Random random = new Random();
        int[] arr = new int[10]; //index가 10인 배열 arr을 생성한다

        int max = 99; //난수 범위의 최대값
        int min = 10; //난수 범위의 최소값
        for (int i=0; i<arr.length; i+=1){
            //10부터 99사이의 난수를 받아 arr[]에 삽입한다
            arr[i] = random.nextInt(max-min) + min;
        }

        System.out.printf("랜덤으로 생성된 배열: ");
        for (int i=0; i<arr.length; i+=1){
            System.out.print(arr[i] + " ");
        }
        System.out.println();

        //정렬을 실행한다
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
