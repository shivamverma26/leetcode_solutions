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
    public ListNode moveToIndex(ListNode l, int index) {
        int i = 0;
        ListNode current = l, prev = null;
        while(current != null && i < index) {
            prev = current;
            current = current.next;
            i++;
        }
        return prev;
    }

    public ListNode mergeInBetween(ListNode list1, int a, int b, ListNode list2) {

        ListNode n1 = moveToIndex(list1, a);
        ListNode n2 = moveToIndex(list1, b + 2);
        ListNode n3 = moveToIndex(list2, Integer.MAX_VALUE);

        n1.next = list2;
        n3.next = n2;
        return list1;
    }
}