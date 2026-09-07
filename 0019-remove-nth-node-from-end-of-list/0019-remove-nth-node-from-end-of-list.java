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
        ArrayList<ListNode> hc=new ArrayList<>();
        ListNode temp=head;
        while(temp!=null){
            hc.add(temp);
            temp=temp.next;  
        }
        int loc=hc.size()-n;
        if(loc==0){
            return head.next;
        }
        hc.get(loc-1).next=hc.get(loc).next;
        return head;

    }
}