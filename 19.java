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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode virtualNode = new ListNode(0,head);
        ListNode foreach = head;
        int size = 0;

        if (head == null || head.next == null) {
            return head = head.next;
        }
        while (foreach != null) {
            foreach = foreach.next;
            size += 1;
        }
        if (size == n) {
            return head.next;
        }
        for (int i = 0; i < size-n; i++) {
            virtualNode = virtualNode.next;
        }
        virtualNode.next = virtualNode.next.next;
        return head;
    }
}

