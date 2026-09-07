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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        if(n==0){
            return head;
        }
        ListNode temp=new ListNode(0);
        temp.next=head;
        ListNode front=temp;
        ListNode back=temp;
        for(int i=0;i<n;i++){
            front=front.next;
        }
        while(front.next!=null){
            front=front.next;
            back=back.next;
        }
        back.next=back.next.next;
        return temp.next;
    }
}