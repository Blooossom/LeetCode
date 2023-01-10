class Test234_Palindrome_Linked_List {
    public boolean isPalindrome(ListNode head){

        if(head == null){
            return true;
        }

        ListNode mid = middle(head);
        ListNode last = reverse(mid);
        ListNode center = head;

        while (true) {
            if (last == null) {
                break;
            }
            if (last.val != center.val) {
                return false;
            }
            last = last.next;
            center = center.next;
        }
        return true;
    }
    public ListNode reverse (ListNode head) {
        ListNode prev = null;
        ListNode center = head;
        while (true) {
            if (center == null) {
                break;
            }
            ListNode temp = center.next;
            center.next= prev;
            prev = center;
            center = temp;
        }
        return prev;
    }

    public ListNode middle(ListNode head){
        ListNode slow = head;
        ListNode fast = head;

        while (true) {
            if (fast == null || fast.next == null) {
                break;
            }
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }
    public class ListNode {
     int val;
      ListNode next;
     ListNode() {}
    ListNode(int val) { this.val = val; }
     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 }
}