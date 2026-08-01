/*
class ListNode {
    int data;
    ListNode prev, next;
    ListNode(int val) {
        this.data = val;
        this.prev = null;
        this.next = null;
    }
}
*/

class Solution {
    public ListNode reverseDLL(ListNode head) {
        // Your code goes here
          if(head == null || head.next == null)
            return head;

        ListNode current = head;
        ListNode last = null;

        while(current != null) {

            // Swap prev and next
            last = current.prev;
            current.prev = current.next;
            current.next = last;

            // Move to next node
            current = current.prev;
        }

        // last will be pointing to old second node
        return last.prev;

    }
}
