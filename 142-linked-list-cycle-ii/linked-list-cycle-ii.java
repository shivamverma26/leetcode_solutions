/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode detectCycle(ListNode head) {
        if(head==null||head.next==null)
        return null;

        ListNode slow=head;
        ListNode fast=head;

        while(slow!=null&&fast!=null&&fast.next!=null){
            slow =slow.next;
            fast= fast.next.next;

            if(slow==fast){
                ListNode temp = head;
                while(temp !=slow){
                    temp = temp.next;
                    slow = slow.next;
                }
                return temp;
            }
        }
        return null;
    }
}

