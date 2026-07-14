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
        // Booundry cheak
        if (headA == null || headB == null) return null;

        ListNode pA = headA;
        ListNode pB = headB;

        
        // Loop terminates when they either meet at the intersect node
        //OR both reach null at the same time (no intersection)
        while (pA != pB) {
            pA = (pA == null) ? headB : pA.next;
            pB = (pB == null) ? headA : pB.next;
        }
     
     return pA;

    }
}