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
    public boolean hasCycle(ListNode head) {
        //start slow & fast pointer
        ListNode slow = head;
        ListNode fast = head;

        while(slow != null && fast != null && fast.next != null){
        //move pointer fast 2time faster than slow pointer
            slow = slow.next;
            fast = fast.next.next;

            //if bouh pointer meet each other return true 
            if(slow == fast){
                return true;
            }
        }
        return false;
    }
}