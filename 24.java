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
    public ListNode swapPairs(ListNode head) {
        ListNode vNode = new ListNode(0, head);
        ListNode dynamicNode = new ListNode(0, null);
        ListNode pre, tmp;
        boolean tag = true;
        ListNode ret = new ListNode(0, null);

        if (head == null || head.next == null) {
            return head;
        }
        while (vNode.next != null && head != null) {
            if (head.next == null) {
                dynamicNode.next = head;
                return ret;
            }
            vNode = head.next;
            tmp = vNode.next;
            vNode.next = head;
            head = tmp;
            vNode.next.next = tmp;

            if (tag == true) {
                ret = vNode;
                dynamicNode = ret.next;
                tag = false;
            } else {
                dynamicNode.next = vNode;
                dynamicNode = vNode.next;
            }
        }
        return ret;
    }
}
