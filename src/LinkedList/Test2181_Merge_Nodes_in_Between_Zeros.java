package LinkedList;

public class Test2181_Merge_Nodes_in_Between_Zeros {
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
        public ListNode mergeNodes(ListNode head) {
            ListNode result = head;
            ListNode curr = head.next;
            int count;
            while (curr != null ) {
                count = 0;
                while (curr.val != 0) {
                    count += curr.val;
                    curr = curr.next;
                }
                result.next = curr;
                curr.val = count;
                result = result.next;
                curr = curr.next;
            }
            return head.next;
        }
    }
}
