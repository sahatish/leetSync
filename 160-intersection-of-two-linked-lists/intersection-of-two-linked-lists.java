public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        if (headA == null || headB == null) return null;

        ListNode p1 = headA;
        ListNode p2 = headB;

        // Traverse both lists
        while (p1 != p2) {
            // If p1 reaches end, redirect to headB
            p1 = (p1 == null) ? headB : p1.next;
            // If p2 reaches end, redirect to headA
            p2 = (p2 == null) ? headA : p2.next;
        }

        // Either intersection node or null
        return p1;
    }
}
