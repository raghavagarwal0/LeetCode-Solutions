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
    public ListNode deleteMiddle(ListNode head) {
        ListNode temp = head;
        if( head == null || head.next==null ) return null;
        int n = 0;
        while(temp!=null)
        {
            n++;
            temp = temp.next;
        }
        n = (n/2)+1;
        temp = head;
        for(int i=1;i<n-1;i++)
        {
            temp = temp.next;
        }
        ListNode helper = temp.next;
        if(helper.next!=null)
        {
            
            temp.next = helper.next;
        }
        else
        {
            temp.next= null;
        }

        return head;
        
    }
}