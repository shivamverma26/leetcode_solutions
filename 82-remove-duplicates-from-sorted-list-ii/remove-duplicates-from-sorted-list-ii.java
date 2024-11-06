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
    public ListNode deleteDuplicates(ListNode head) {
        if(head==null || head.next==null)
            return head;
        ListNode head1=head,head2=null,temp=null;
        while(head1!=null && head1.next!=null){
            if(head1.val!=head1.next.val){
                ListNode node = new ListNode(head1.val);
                if(head2==null)
                    head2=temp=node;
                else{
                    temp.next=node;
                    temp=node;
                }
            }
            else{
                while(head1.next!=null && head1.val==head1.next.val)
                    head1=head1.next;
            }
            head1=head1.next;
        }
        if(temp==null)
            return head1;
        temp.next=head1;
        return head2;
    }
}