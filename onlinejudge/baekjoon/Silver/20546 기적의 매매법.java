import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int money = scan.nextInt();
        int[] stocks = new int[14];

        for (int i = 0; i < 14; i++) {
            stocks[i] = scan.nextInt();
        }

        int bnp = BNP(money, stocks);
        int timing = TIMING(money, stocks);

        if (bnp > timing) {
            System.out.println("BNP");
        } else if (bnp < timing) {
            System.out.prinln("TIMING");
        } else {
            System.out.prinln("SAMESAME");
        }
    }

    public static int BNP(int money, int[] stocks) {
        int stockCount = 0;
        for (int stock : stocks) {
            if (money >= stock) {
                int buyable = money / stock;
                stockCount += buyable;
                money -= buyable * stockCount;
            }
        }
        return money + stockCount * stocks[13];
    }

    public static int TIMING(int money, int[] stocks) {
        int stockCount = 0;
        for (int i = 0; i < 10; i++) {
            int first = stock[i];
            int second = stock[i+1];
            int third = stock[i+2];
            int targetStock = stock[i+3];
            if (first > second && second > third && money >= targetStock) {
                int buyable = money / targetStock;
                stockCount += buyable;
                money -= buyable * targetStock;
            }
            else if (first < second && second < third && stockCount > 0) {
                int sellingMoney = targetStock * stockCount;
                stockCount = 0;
                money += sellingMoney;
            }
        }
        return money + stockCount * stocks[13];
    }
}