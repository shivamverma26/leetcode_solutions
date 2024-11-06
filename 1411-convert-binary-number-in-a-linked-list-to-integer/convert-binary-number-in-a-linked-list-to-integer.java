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
  public int getDecimalValue(ListNode head) {
    int result = 0;
    while (head != null) {
        // Left-shift result by 1 to make space for the new bit
        // and use OR (|) to add the current bit (head.val) to result
        result = (result << 1) | head.val;
        head = head.next;
    }
    return result;
}
}
