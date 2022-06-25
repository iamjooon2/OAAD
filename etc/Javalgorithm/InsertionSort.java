import java.util.Random;

public class InsertionSort {
    public static void main(String[] args) {
        Random random = new Random();
        //index가 10인 배열 arr을 생성한다
        int[] arr = new int[10];

        //10~99 사이의 숫자 10개를 배열 arr에 집어넣는다
        int max = 99;
        int min = 10;
        for (int i=1; i<arr.length; i+=1){
            arr[i] = random.nextInt(max-min) + min;
        }
        //책의 알고리즘에서는 0번째 요소가 정렬되어있다고 가정하므로, 한자리 수를 0번째 수로 넣어준다
        arr[0] = 9;

        //정렬 전 배열을 출력한다
        System.out.print("정렬 전: ");
        for (int i=0; i<arr.length; i+=1){
            System.out.print(arr[i] + " ");
        }
        System.out.println();

        //삽입정렬을 실행한다
        insertionSort(arr, arr.length);

        //삽입정렬이 완료된 후의 배열을 출력한다
        System.out.printf("삽입 정렬 완료!: ");
        for (int i=0; i<arr.length; i+=1){
            System.out.print(arr[i] + " ");
        }
    }

    public static void insertionSort(int[] arr, int n){
        //a[0]은 정렬되어있으므로, a[1]부터 배열의 크기를 하나씩 늘려가며 반복한다
        for (int i=2; i<n; i+=1){

            //정렬된 배열의 크기
            int loc = i-1;

            //비교할 원소를 newItem으로 선언한다
            int newItem = arr[i];

            //비교할 원소 newItem이 이전 원소보다 크기 전까지 반복하며
            while (loc>=1 && newItem < arr[loc]){

                //이전원소를 한 칸씩 미뤄준다
                arr[loc+1] = arr[loc];
                loc-=1;
            }

            //newItem이 앞의 원소보다 작은경우, newItem을 loc 바로 뒤에 위치시킨다
            arr[loc+1] = newItem;
        }
    }
}
