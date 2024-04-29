class Solution {
    public int solution(int number, int limit, int limitPower) {
        int[] powers = new int[number];
                
        for (int i = 1; i <= number; i += 1) {
            int divisor = 0;
            for (int j = 1; j * j <= i; j += 1) {
                if (i % j == 0) {
                    divisor += 1;
                    if (j * j < i)  {
                        divisor += 1;
                    }
                }
            }
            powers[i-1] = divisor;
        }
        
        int answer = 0;
        
        for (int power : powers) {
            if (power > limit) {
                answer += limitPower;
            } else {
                answer += power;
            }
        }
        
        return answer;
    }
}