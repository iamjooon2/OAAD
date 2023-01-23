public class Main {
    public static void main(String[] args) {
        int n = 1260;
        int count = 0;

        int[] coinType = {500, 100, 50, 10};

        for (int coin : coinType) {
            count += n / coin; // 해당 화폐로 거슬러 줄 수 있는 동전의 개수 세기
            n %= coin;
        }

        System.out.println(count);
    }
}