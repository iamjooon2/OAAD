import java.util.Random;

public class MergeSort {
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

        //병합 정렬을 실행한다
        mergeSort(arr, 0, arr.length-1);

        //병합 정렬 후의 배열을 실행한다
        System.out.print("병합 정렬 완료!: ");
        for (int i=0; i<arr.length; i+=1){
            System.out.print(arr[i] + " ");
        }
    }

    public static void mergeSort(int[] arr, int start, int end){
        if (start < end){

            //배열의 중간지점을 mid로 선언한다
            int mid = (start + end)/2;

            //전반부 정렬 후, 후반부를 정렬한다
            mergeSort(arr, start, mid);
            mergeSort(arr,mid+1, end);

            //배열을 병합한다
            merge(arr, start, mid, end);
        }
    }

    public static void merge(int[] arr, int p, int q, int r){
        //전반부에서 시작할 인덱스 i
        int i = p;
        //후반부에서 시작할 인덱스 j
        int j = q+1;
        //임시 배열 tmp에서 사용할 인덱스 t
        int t = 0;

        //임시로 사용할 배열 tmp
        int[] tmp = new int[arr.length];

        //배열의 전반부와 후반부를 함께 비교하며
        while (i<=q && j<=r){

            //더 작은 값을 tmp에 넣고,
            //임시배열 인덱스 t와, 이동시킨 부분의 인덱스를 증가시킨다
            if (arr[i] <= arr[j]){
                tmp[t] = arr[i];
                t += 1;
                i += 1;
            } else{
                tmp[t] = arr[j];
                t += 1;
                j += 1;
            }
        }
        //왼쪽 배열이 남은 경우 tmp에 저장시켜준다
        while (i<=q){
            tmp[t] = arr[i];
            t += 1;
            i += 1;
        }
        //오른쪽 배열이 남은 경우 tmp에 저장시켜준다
        while (j<=r){
            tmp[t] = arr[j];
            t += 1;
            j += 1;
        }

        //인덱스를 초기화 시킨 후 tmp에 저장된 내용을 arr로 이동시킨다
        i = p;
        t = 0;
        while (i<=r){
            arr[i] = tmp[t];
            i += 1;
            t += 1;
        }

    }
}