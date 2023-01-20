package LinkedList;

public class Test2487_Remove_Nodes_From_Linked_List {
    static class ListNode {
        int val;
        ListNode next;

        public ListNode() {
        }

        public ListNode(int val) {
            this.val = val;
        }

        public ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }
    class Solution {
        public ListNode removeNodes(ListNode head) {
            ListNode curr = head;
            ListNode right = head.next;
            ListNode prev = null;
            while(right.next != null) {
                if (right.val > curr.val) {
                    curr = prev;
                }
                else {
                    prev = curr;
                    curr.next = right;
                    right = right.next;
                    curr = curr.next;
                }
            }
            return head;
        }
    }
}
