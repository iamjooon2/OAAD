class Solution {

    public long maxKelements(int[] nums, int k) {
        Queue<Integer> proiotiryQueue = new PriorityQueue<>(Collections.reverseOrder());
        for (int num : nums) {
            proiotiryQueue.offer(num);
        }

        long ans = 0;
        for (int i = 0; i < k; i += 1) {
            int v = proiotiryQueue.poll();
            ans += v;

            int ceiled = (v + 2) / 3;
            proiotiryQueue.offer(ceiled);
        }
        return ans;
    }
}
