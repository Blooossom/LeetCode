package LinkedList;

import java.util.ArrayList;
import java.util.List;

public class Test382_Linked_List_Random_Node {
    class Solution {

        private List<Integer> list = new ArrayList<>();
        private int size = Integer.MAX_VALUE;
        private ListNode temp = null;

        public Solution(ListNode head) {
            temp = head;
        }

        public int getRandom (){
            if (size != Integer.MAX_VALUE) {
                return list.get((int)(Math.random() * (size)));
            }
            else {
                while (temp != null) {
                    list.add(temp.val);
                    temp = temp.next;
                }
                size = list.size();
                return list.get((int) (Math.random() * (size)));
            }
        }
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
}
