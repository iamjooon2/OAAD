class Solution {
    public boolean checkPowersOfThree(int n) {
        while (n > 0) {
            if (n % 3 == 2) { // 3진법 변환 시 '2'가 나오면 불가능
                return false;
            }
            n /= 3; // 다음 자리로 이동
        }
        return true;
    }
}

