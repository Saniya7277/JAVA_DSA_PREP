/*
Definition of singly linked list:
class ListNode{
    public int data;
    public ListNode next;
    ListNode() { data = 0; next = null; }
    ListNode(int x) { data = x; next = null; }
    ListNode(int x, ListNode next) { data = x; this.next = next; }
}
*/
class Solution {
    public ListNode sortList(ListNode head) {

        if (head == null || head.next == null) {
            return head;
        }

        // Dummy nodes for 0s, 1s and 2s
        ListNode zeroDummy = new ListNode(-1);
        ListNode oneDummy = new ListNode(-1);
        ListNode twoDummy = new ListNode(-1);

        ListNode zero = zeroDummy;
        ListNode one = oneDummy;
        ListNode two = twoDummy;

        ListNode curr = head;

        // Separate nodes into three lists
        while (curr != null) {

            if (curr.data == 0) {
                zero.next = curr;
                zero = zero.next;
            }
            else if (curr.data == 1) {
                one.next = curr;
                one = one.next;
            }
            else {
                two.next = curr;
                two = two.next;
            }

            curr = curr.next;
        }

        // Connect 0s -> 1s -> 2s
        zero.next = oneDummy.next;
        one.next = twoDummy.next;
        two.next = null;

        return zeroDummy.next;
    }
}
