import java.util.Random;

public class QuickSort {
    public static void main(String[] args) {
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

        //퀵 정렬을 실행한다
        quickSort(arr, 0, arr.length-1);

        //퀵 정렬 실행 후의 배열을 출력한다
        System.out.print("퀵 정렬 완료!: ");
        for (int i=0; i<arr.length; i+=1){
            System.out.print(arr[i] + " ");
        }
    }

    public static void quickSort(int[] arr, int start, int end){
        if (start < end){
            //기준원소의 인덱스 q를 선언한다
            int q = partition(arr, start, end);

            //기준원소의 왼쪽부분(기준원소보다 작은 부분), 오른쪽부분(기준원소보다 큰 부분)을 정렬한다
            quickSort(arr, start, q-1);
            quickSort(arr, q+1, end);
        }
    }

    public static int partition(int[] arr, int p, int r){
        //기준원소(책의 알고리즘에서는 초기상태 배열의 가장 마지막 원소)를 x로 선언한다
        int x = arr[r];

        //기준원소보다 작은 원소들의 배열의 첫 원소의 인덱스를 i로 선언한다
        int i = p-1;

        //정렬이 되지 않은 원소들에 대해서 탐색하며 반복한다
        for (int j=p; j<r; j+=1){

            //탐색 중, 요소값이 기준원소보다 작다면
            if (arr[j] <= x){

                //기준원소보다 작은 원소들의 배열의 크기를 증가시키고, 해당 요소값을 증가시킨 자리에 이동시킨다
                i += 1;
                int tmp1 = arr[i];
                arr[i] = arr[j];
                arr[j] = tmp1;
            }
        }
        //기준원소의 위치를 정렬시킨다
        int tmp2 = arr[r];
        arr[r] = arr[i+1];
        arr[i+1] = tmp2;

        //기준원소의 인덱스를 리턴한다
        return i + 1;
    }
}