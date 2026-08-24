/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        // If either list is empty, there can't be an intersection
        if (headA == null || headB == null) {
            return null;
        }
        
        ListNode pointerA = headA;
        ListNode pointerB = headB;
        
        // Loop until both pointers meet. 
        // If there is no intersection, both will eventually become null at the same time.
        while (pointerA != pointerB) {
            // If pointerA reaches the end of listA, redirect it to the head of listB
            pointerA = (pointerA == null) ? headB : pointerA.next;
            
            // If pointerB reaches the end of listB, redirect it to the head of listA
            pointerB = (pointerB == null) ? headA : pointerB.next;
        }
        
        // Return either pointer (they will both point to the intersection node, or null)
        return pointerA;
    }
}