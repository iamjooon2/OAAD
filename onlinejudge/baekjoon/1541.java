import java.util.*;

public class Main {
    
    static final Scanner scan = new Scanner(System.in);
    
    public static void main(String[] args) {
        String input = scan.nextLine();

        // 빼기를 기준으로 나눠줌..
        String[] split = input.split("-");
        List<Integer> arr = new ArrayList<>();
        for (String element : split) {
            int num = 0;
            // 숫자에 더하기가 껴있는 경우
            if (element.contains("+")) {
                // 다 더해준다
                for (String numberString : element.split("\\+")) {
                    num += Integer.parseInt(numberString);
                }
            } else {
                num = Integer.parseInt(element);
            }
            arr.add(num);
        }
        // 첫번째 숫자만 뺴준 후, 나머지 다 빼줌
        int answer = arr.get(0);
        for (int i = 1; i < arr.size(); i++) {
            answer -= arr.get(i);
        }

        System.out.println(answer);
    }
}
