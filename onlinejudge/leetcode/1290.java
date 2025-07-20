class Solution {
    public int getDecimalValue(ListNode head) {
        List<Integer> arr = new ArrayList<>();

        while (head != null) {
            arr.add(head.val);
            head = head.next;
        }

        int index = arr.size() - 1;
        int sum = 0;

        for (int num : arr) {
            if (num == 1) {
                sum += (int) Math.pow(2, index);
            }
            index--;
        }

        return sum;
    }
}

