import java.util.*;

class Solution {
    public int[] solution(String[] keymap, String[] targets) {
        int[] answer = new int[targets.length];
        Map<String, Integer> keypad = new HashMap<>();
        
        for (int i = 0; i < keymap.length; i += 1) {
            for (int j = 0; j < keymap[i].length(); j += 1) {
                String now = keymap[i].split("")[j];
                
                if (keypad.containsKey(now)) {
                    int index = keypad.get(now);
                    keypad.put(now, Math.min(index, j+1));
                } else {
                    keypad.put(now, j + 1);
                }
            }
        }
        
        for (int i = 0; i < targets.length; i += 1) {
            String target = targets[i];
            int count = 0;
            boolean flag = true;
            for (String now : target.split("")) {
                if (keypad.containsKey(now)) {
                    count += keypad.get(now);
                } else {
                    flag = false;
                    break;
                }
            }
            
            answer[i] = flag ? count : -1;
        }
        
        return answer;
    }
}
