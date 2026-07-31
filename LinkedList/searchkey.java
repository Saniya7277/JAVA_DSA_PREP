/* Defination of ListNoode
class ListNode {
    int val;
    ListNode next;

    ListNode(int value) {
        this.val = value;
        this.next = null;
    }
}
*/


class Solution {
    public boolean searchKey(ListNode head, int key) {
        // Your code goes here
        ListNode curr=head;
        while(curr!=null){
            if(curr.val==key){
                return true;
            }
            curr=curr.next;
        }
        return false;
    }
}
