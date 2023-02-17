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
    public ListNode rotateRight(ListNode head, int k) {
        ListNode temp=head;
        int count=0;
        if(head==null || k==0)
        {
            return head;
        }
        while(temp.next!=null)
        {
            temp=temp.next;
            count++;
        }
        temp.next=head;

        k=k % (count+1);

        int j=count-k;
        temp=head;


        while(j>0)
        {
            temp=temp.next;
            j--;

        }
        ListNode returnhead=temp.next;
        temp.next=null;
        return returnhead;        
    }
}