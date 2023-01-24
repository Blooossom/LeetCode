package LinkedList;

public class Test19_Remove_Nth_Node_From_End_of_List {
    class Solution {
        public ListNode removeNthFromEnd(ListNode head, int n) {
            ListNode temp = head;
            int size = 0;
            while (temp != null) {
                size++;
                temp = temp.next;
            }
            if (size > 1 && n < size) {
                int idx = 1;
                ListNode curr = head;
                ListNode fast = head.next;
                while (idx < size - n) {
                    curr = curr.next;
                    fast = fast.next;
                    idx++;
                }
                if (fast != null) {
                    curr.next = fast.next;
                }

            }
            else {
                head = head.next;
                return head;
            }
            return head;
        }
    }
    public class ListNode {
        int val;
        ListNode next;

        public ListNode(int val) {
            this.val = val;
        }

        public ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }

        public ListNode() {
        }
    }
}
