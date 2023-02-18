/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode Cyclepresent(ListNode head)
    {
        ListNode slow=head;
        ListNode fast=head;

        while(fast!=null && fast.next!=null)
        {
            slow=slow.next;
            fast=fast.next.next;
            if(fast==slow)
            {
                return slow;
            }

        }
        return null;
    }
    public ListNode detectCycle(ListNode head) {
        ListNode meet=Cyclepresent(head);

        ListNode start=head;
        int count=0;

        if(meet==null)
        {
            return null;
        }
        else{
            while(start !=meet)
            {
                start=start.next;
                meet=meet.next;
            }
            return start;

        }

        
        
    }
}