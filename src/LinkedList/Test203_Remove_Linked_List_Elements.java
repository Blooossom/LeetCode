package LinkedList;

import java.io.*;
public class Test203_Remove_Linked_List_Elements {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    }
    static class ListNode{
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
        public ListNode removeElements(ListNode head, int val) {
            while (head != null & head.val == val) {
                head = head.next;
            }
            ListNode curr = head;

            while (head != null && head.next != null) {
                if (head.next.val == val) {
                    head.next = head.next.next;
                }
                else {
                    head = head.next;
                }
            }
            return curr;
        }
    }
}
