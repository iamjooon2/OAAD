import java.util.*;
import java.util.Map.Entry;

class Solution {
    public String[] solution(String[] players, String[] callings) {
        Map<String, Integer> rank = new LinkedHashMap<>(players.length);
        String[] answer = new String[players.length];

        for (int i = 0; i < players.length; i++) {
            rank.put(players[i], i);
        }

        for (String chaser : callings) {
            int index = rank.get(chaser); // 추월하는 사람의 인덱스
            String target = players[index - 1]; // 제칠 사람 이름

            players[index] = target; // 제쳐지기
            players[index - 1] = chaser; // 제치기

            // rank 업데이트
            rank.put(target, index);
            rank.put(chaser, index - 1);
        }

        for (Entry<String, Integer> entry : rank.entrySet()) {
            answer[entry.getValue()] = entry.getKey();
        };

        return answer;
    }
}