package LinkedList;

import java.io.*;
public class Test206_Reverse_Linked_List {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    }
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
        public ListNode reverseList(ListNode head) {
            ListNode curr = head;
            ListNode prev = null;
            while (head != null) {
                curr = head;
                head = head.next;
                curr.next = prev;
                prev = curr;
            }
            return prev;
        }
    }
}
