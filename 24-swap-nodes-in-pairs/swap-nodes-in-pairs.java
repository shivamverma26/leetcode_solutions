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
        if(head==null || head.next == null){
            return head;
        }
        ListNode ptr1 = head;
        ListNode ptr2 = head.next;
        ListNode ptr3 = head.next.next;
        
        ptr2.next = ptr1;
        ptr1.next = swapPairs(ptr3);
        
        return ptr2;
    }
}