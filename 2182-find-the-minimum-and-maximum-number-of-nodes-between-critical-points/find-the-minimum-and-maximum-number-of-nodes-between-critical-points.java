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
    public int[] nodesBetweenCriticalPoints(ListNode head) {
         int firstCritical = -1, lastCritical = -1, minDistance = Integer.MAX_VALUE;
        int index = 1; 
        int prevVal = head.val;
        
        ListNode prev = head;
        head = head.next; 
        
        while (head != null && head.next != null) {
            if ((head.val > prev.val && head.val > head.next.val) || 
                (head.val < prev.val && head.val < head.next.val)) {
                    
                if (firstCritical == -1) {
                    firstCritical = index; // First critical point
                } else {
                    minDistance = Math.min(minDistance, index - lastCritical);
                }
                lastCritical = index; 
            }

            prev = head;
            head = head.next;
            index++;
        }

        if (firstCritical == -1 || lastCritical == firstCritical) {
            return new int[]{-1, -1};
        }

        int maxDistance = lastCritical - firstCritical;

        return new int[]{minDistance, maxDistance};
    }
}