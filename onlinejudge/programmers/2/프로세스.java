import java.util.*;

class Solution {
    public int solution(int[] priorities, int location) {
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        Queue<Process> queue = new LinkedList<>();

        for (int i = 0; i < priorities.length; i += 1) {
            queue.offer(new Process(i, priorities[i]));
            pq.offer(priorities[i]);
        }

        int answer = 0;
        while (!queue.isEmpty()) {
            Process now = queue.poll();
            if (now.priority == pq.peek()) {
                pq.poll();
                answer++;
                
                if (now.id == location) {
                    return answer;
                }
                
            } else {
                queue.offer(now);
            }
        }
        return answer;
    }

    class Process {
        int id;
        int priority;

        Process(int id, int priority) {
            this.id = id;
            this.priority = priority;
        }
    }
}
