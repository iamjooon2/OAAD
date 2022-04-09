import java.util.Random;

public class SelectionSort{
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

        //선택 정렬을 실행한다
        selectionSort(arr, arr.length);

        //선택 정렬 실행 후의 배열을 출력한다
        System.out.print("선택 정렬 완료!: ");
        for (int i=0; i<arr.length; i+=1){
            System.out.print(arr[i] + " ");
        }
    }

    public static void selectionSort(int[] arr, int n){
        //탐색하는 전체 배열의 크기를 하나씩 줄인다
        for (int i=0; i<n; n-=1){

            //가장 큰 수의 인덱스를 k에 담든다
            int k = theLargest(arr, n);

            //배열의 가장 마지막 요소와 가장 큰 값을 교환한다
            int tmp = arr[n-1];
            arr[n-1] = arr[k];
            arr[k] = tmp;
        }
    }

    public static int theLargest(int[] arr, int last){

        //입력받은 배열의 크기에서 하나 작은 값을 largestIdx로 설정한다
        int largestIdx = last-1;

        //범위 안의 모든 원소를 반복하며
        for (int j=0; j<last; j+=1){
            //가장 큰 값의 요소의 인덱스를 설정한다
            if (arr[j] > arr[largestIdx]){
                largestIdx = j;
            }
        }
        //가장 큰 수의 인덱스를 리턴한다
        return largestIdx;
    }
}