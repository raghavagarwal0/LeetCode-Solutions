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
    public ListNode removeElements(ListNode head, int vall) {
        while(head !=null && head.val==vall)
        {
            head = head.next;
        }
        if(head==null || head.next==null) return head;
        ListNode helper = head;
        ListNode current = head.next;
        while(current.next!=null)
        {
            if(current.val!=vall)
            {
                helper.next = current;
                helper = helper.next;
            }
            current = current.next;
        }
        if(current.val==vall)
        {
            helper.next=null;
        }
        else
        {
            helper.next = current;
        }
            return head;
    }
}