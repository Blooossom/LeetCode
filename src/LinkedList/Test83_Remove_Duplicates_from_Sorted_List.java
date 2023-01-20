package LinkedList;

public class Test83_Remove_Duplicates_from_Sorted_List {
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
    }
    static class Solution {
        public ListNode deleteDuplicates(ListNode head) {
            ListNode result = head;
            while (result != null && result.next != null) {
                if (result.val == result.next.val) {
                    result.next = result.next.next;
                }
                else {
                    result = result.next;
                }
            }
            return head;
        }
    }
}
