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
        if(head==null || head.next==null ) return head;
        ListNode low = head;
        ListNode high = head.next;
        while(high!=null)
        {
            if(high.val==low.val)
            {
                low.next = high.next;
                high = high.next;
            }
            else 
            {
                low = low.next;
                high = high.next;
            }
        }
        return head;
    }
}