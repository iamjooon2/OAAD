import java.util.Random;

public class BubbleSort {
    public static void main(String[] args){
        Random random = new Random();
        //index가 10인 배열 arr을 생성한다
        int[] arr = new int[10];

        //10~99 사이의 숫자 10개를 배열 arr에 집어넣는다
        int max = 99;
        int min = 10;
        for (int i=0; i<arr.length; i+=1){
            arr[i] = random.nextInt(max-min) + min;
        }

        //정렬 전 배열을 출력한다
        System.out.print("정렬 전: ");
        for (int i=0; i<arr.length; i+=1){
            System.out.print(arr[i] + " ");
        }
        System.out.println();

        //버블 정렬을 실행한다
        bubbleSort(arr, arr.length);

        //병합 정렬 실행 후의 배열을 출력한다
        System.out.print("버블 정렬 완료!: ");
        for (int i=0; i<arr.length; i+=1){
            System.out.print(arr[i] + " ");
        }
    }

    public static void bubbleSort(int[] arr, int n){
        //탐색하는 전체 배열의 크기를 하나씩 줄인다
        for (int i=0; i<n; n-=1){

            //크기가 줄여진 배열의 요소를 반복한다
            for (int j=0; j<n-1; j+=1){

                //j번째 인덱스의 요소가 j+1번째 인덱스의 요소보다 크다면
                if (arr[j]> arr[j+1]){

                    //두 요소를 교환한다
                    int tmp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = tmp;
                }
            }
        }
    }
}
