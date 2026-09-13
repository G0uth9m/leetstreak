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
        if(head==null){
            return head;
        }
        ListNode dummy=head;
        ListNode prev=head;
        head=head.next;
        while(head!=null){
            if(head!=null && head.val==prev.val){
                while(head!=null && head.val==prev.val){
                    head=head.next;
                }
            }
            if(head==null){
                prev.next=null;
                return dummy;
            }
            prev.next=head;
            prev=head;
            head=head.next;
        }
        return dummy;
    }
}