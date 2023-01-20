package LinkedList;

import java.io.*;
import java.util.LinkedList;

public class Test21_Merger_Two_Sorted_Lists {
    public static void main(String[] args) {
        LinkedList<ListNode> list = new LinkedList<>();

        ListNode tail = new ListNode(1  );
        ListNode test = new ListNode(2);
        System.out.println(tail);
        System.out.println(test);
        System.out.println(mergeTwoLists(tail, test));
    }
    static class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) {
            this.val = val;
        }
        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }

        @Override
        public String toString() {
            return "ListNode{" +
                    "val=" + val +
                    ", next=" + next +
                    '}';
        }
    }
    static ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        if (list1 == null) {
            return list2;
        }
        if (list2 == null) {
            return list1;
        }
        ListNode head = new ListNode();
        ListNode curr = head;
        while (list1 != null && list2 != null) {
            if (list1.val < list2.val) {
                curr.next = list1;
                list1 = list1.next;
            }
            else {
                curr.next = list2;
                list2 = list1.next;
            }
            curr = curr.next;
        }
        if (list1 != null) {
            curr.next = list1;
        }
        else {
            curr.next = list2;
        }
        return head.next;
    }
}
