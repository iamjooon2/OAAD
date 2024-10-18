import java.util.*;

class Solution {
    public int solution(int[] scoville, int K) {
        Queue<Integer> pq = new PriorityQueue<>();
        
        for (int foodScoville : scoville) {
            pq.add(foodScoville);
        }
        
        int answer = 0;
        
        while (true) {
            int min = pq.poll();
            
            // 한개밖에 없는데 그게 K보다 없다면 스코빌 지수 만들기 불가
            if (pq.isEmpty() && min < K) {
                answer = -1;
                break;
            }
            
            // 가장 작은 숫자가 K보다 크면 스코빌 만들기 성공
            if (min >= K) {
                break;
            }
            
            // 두 번째깨 0이라면 스코빌 만들기 불가
            int secondMin = pq.poll();
            if (secondMin == 0) {
                answer = -1;
                break;
            }
            
            // 공식 적용
            int mixed = min + (secondMin * 2);
            pq.add(mixed);
            
            answer += 1;
        }
        
        return answer;
    }
}
