public class Solution {
    public int minimizedMaximum(int n, int[] quantities) {
        int left = 1;
        int right = getMax(quantities);

        while (left < right) {
            int mid = left + (right - left) / 2;
            if (canDistribute(mid, quantities, n)) {
                right = mid; // 조건을 만족하면 더 작은 최대 수량을 시도
            } else {
                left = mid + 1; // 조건을 만족하지 못하면 큰 수량을 시도
            }
        }
        return left;
    }

    private int getMax(int[] quantities) {
        int max = Integer.MIN_VALUE;
        for (int quantity : quantities) {
            max = Math.max(max, quantity);
        }
        return max;
    }

    // 최대 제품 수량 maxProducts로 n개 이하의 매장에 배포할 수 있는지 확인하는 메소드
    private boolean canDistribute(int maxProducts, int[] quantities, int n) {
        int storesNeeded = 0;
        for (int quantity : quantities) {
            storesNeeded += (quantity + maxProducts - 1) / maxProducts; // 올림 계산
        }
        return storesNeeded <= n;
    }
}
