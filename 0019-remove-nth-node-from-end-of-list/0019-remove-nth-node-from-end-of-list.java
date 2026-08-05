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
        ListNode curr=head;
        ListNode prev=null;

        while(curr!=null)
        {
            ListNode next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }
        ListNode temp=prev;
        if(n==1)
        {
            prev=prev.next;
        }
        else{
            temp=prev;
            for(int i=1;i<n-1;i++)
            {
                temp=temp.next;
            }
            temp.next=temp.next.next;
        }
        ListNode newhead = prev;
        prev = null;
        curr = newhead;

        while (curr != null) {
            ListNode next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        return prev;   
        
        
    }
}