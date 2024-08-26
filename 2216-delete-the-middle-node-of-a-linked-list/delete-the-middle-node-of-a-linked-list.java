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
    public ListNode deleteMiddle(ListNode head) {
        // If the list is empty or has only one node, return null
        if (head == null || head.next == null) {
            return null;
        }

        // Initialize pointers
        ListNode slow = head;
        ListNode fast = head;
        ListNode prev = null; // to keep track of the node before the middle

        // Use the fast and slow pointer technique to find the middle node
        while (fast != null && fast.next != null) {
            prev = slow; // prev will end up pointing to the node before the middle
            slow = slow.next;
            fast = fast.next.next;
        }

        // Delete the middle node
        prev.next = slow.next;

        return head;
    }
}
