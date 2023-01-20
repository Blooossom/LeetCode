package LinkedList;

public class Test160_Intersection_of_Two_Linked_Lists {
    static class ListNode {
        int val;
        ListNode next;

        public ListNode() {
        }

        public ListNode(int x) {
            val = x;
            next = null;
        }

        public ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }
    class Solution {
        public ListNode getIntersectionNode (ListNode headA, ListNode headB) {
            return headA;
        }
    }
}
