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
    public ListNode removeNodes(ListNode head) {
        ListNode current = head;
        ListNode prev = null;
        
        head = reverse(head);

        ListNode dummy = new ListNode(0); 
        ListNode newHead = dummy; 
        int max = Integer.MIN_VALUE;

        while(head != null){

            if(head.val >= max){
                max = head.val;
                newHead.next = head; 
                newHead = newHead.next; 
            }
            head = head.next; 
        }


        newHead.next = null;  

        return reverse(dummy.next);
    } 

    private ListNode reverse(ListNode head){
        ListNode prev = null;
        ListNode current = head;

        while(current != null){
            ListNode next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        return prev;
    }
}
