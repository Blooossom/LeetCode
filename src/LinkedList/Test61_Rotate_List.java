package LinkedList;

import java.util.Stack;

public class Test61_Rotate_List {
    class Solution {
        public ListNode rotateRight(ListNode head, int k) {
            if (head == null || head.next == null) {
                return head;
            }
            ListNode temp = head;
            ListNode curr = head;
            Stack<ListNode> stack = new Stack<>();

            while(temp != null) {
                stack.push(temp);
                temp = temp.next;
            }
            k = k % stack.size();

            for (int i = 0; i < k; i++) {
                temp = stack.pop();
                temp.next = curr;
                curr = temp;
                stack.peek().next = null;
            }
            return curr;
        }
    }
    public class ListNode {
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
}
