package LinkedList;

public class Test328_Odd_Even_Linked_List {
    static class ListNode {
        int val;
        ListNode next;

        public ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }

        public ListNode(int val) {
            this.val = val;
        }

        public ListNode() {
        }
    }
    class Solution {
        public ListNode oddEvenList(ListNode head) {
            if (head == null) {
                return head;
            }
            ListNode odd = head;
            ListNode even = head.next;
            ListNode result = even;

            while (odd.next != null && even.next != null) {
                odd.next = odd.next.next;
                even.next = even.next.next;
                odd = odd.next;
                even = even.next;
            }
            odd.next = result;
            return head;
        }
    }
}
