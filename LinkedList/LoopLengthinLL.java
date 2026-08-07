/*Definition of singly linked list:
class ListNode {
    int val;
    ListNode next;

    ListNode() {
        val = 0;
        next = null;
    }

    ListNode(int data1) {
        val = data1;
        next = null;
    }

    ListNode(int data1, ListNode next1) {
        val = data1;
        next = next1;
    }
}
 */

 class Solution {
     public int findLengthOfLoop(ListNode head) {

         ListNode slow = head;
        ListNode fast = head;

        
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;

            if (slow == fast) {
                
                // Count length of loop
                int count = 1;
                ListNode temp = slow.next;

                while (temp != slow) {
                    count++;
                    temp = temp.next;
                }

                return count;
            }
        }

        // No loop
        return 0;

     }
 }
