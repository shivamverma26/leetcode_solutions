/**
 * Definition for singly-linked list.
 * public class ListNode {
 * int val;
 * ListNode next;
 * ListNode() {}
 * ListNode(int val) { this.val = val; }
 * ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    // public ListNode reverse(ListNode head) {
    // ListNode curr = head, prev = null, next;

    // while (curr != null) {
    // next = curr.next;
    // curr.next = prev;
    // prev = curr;
    // curr = next;
    // }
    // return prev;

    // }

    public int[] nextLargerNodes(ListNode head) {
        int count = 0;

        ListNode temp = head;
        while (temp != null) {
            temp = temp.next;
            count++;
        }

        int arr[] = new int[count];
        int ans[] = new int[count];
        int i = 0;

        while (head != null) {
            arr[i++] = head.val;
            head = head.next;
        }

        i = 0;
        for (int j = 0; j < count; j++) {
            ans[i] = 0;
            for (int k = j + 1; k < count; k++) {
                if (arr[k] > arr[j]) {
                    ans[i] = arr[k];
                    break;
                }

            }
            i++;
        }
        return ans;

    }
}