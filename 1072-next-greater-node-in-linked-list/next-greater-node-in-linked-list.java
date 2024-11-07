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
    public int[] nextLargerNodes(ListNode head) {
        ListNode temp = head;
        int count = 0;
        while (temp != null) {
            count++;
            temp = temp.next;
        }
        int[] arr = new int[count];
        int[] result = new int[count];
        temp = head;
        for (int i = 0; i < count; i++) {
            arr[i] = temp.val;
            temp = temp.next;
        }
        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < count; i++) {
            while (!stack.isEmpty() && arr[i] > arr[stack.peek()]) {
                int index = stack.pop();
                result[index] = arr[i]; 
            }
            stack.push(i); 
        }
        return result;
    }
}