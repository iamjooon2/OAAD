/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public boolean isPalindrome(ListNode head) {
        List<Integer> list = new ArrayList<>();

        ListNode current = head;
        list.add(head.val);
        while (current.next != null) {
            current = current.next;
            int number = current.val;
            list.add(number);
        }

        int size =  list.size();
        for (int i = 0; i < size / 2; i += 1) {

            if (list.get(i) != list.get(size - i - 1) ){
                return false;
            }
        }
        return true;
    }
}
