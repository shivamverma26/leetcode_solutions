class Solution {
    public ListNode[] splitListToParts(ListNode head, int k) {
        ListNode cur = head;
        ListNode[] answer = new ListNode[k];
        int ptr = 0, listLength = 0;

        while (cur != null) {
            listLength++;
            cur = cur.next;
        }

        int extra = listLength % k;
        int partLength = listLength / k;
        cur = head;

        while (cur != null) {
            answer[ptr++] = cur;
            int currentLength = partLength - 1 + ((extra-- > 0) ? 1 : 0);

            for (int i = 0; i < currentLength; i++)
                cur = cur.next;

            ListNode temp = cur.next;
            cur.next = null;
            cur = temp;
        }
        return answer;
    }
}