/*
Defination of linked list
class ListNode {
    int data;
    ListNode next;

    ListNode() {
        this.data = 0;
        this.next = null;
    }

    ListNode(int x) {
        this.data = x;
        this.next = null;
    }

    ListNode(int x, ListNode next) {
        this.data = x;
        this.next = next;
    }
}
*/
class Solution {
    public ListNode deleteHead(ListNode head) {
        //your code goes here

        if(head==null){

        }else if(head.next==null) {
            head=null;

        }
        else if(head.next!=null){
            ListNode curr=head;
            head=head.next;
            curr.next=null;
            
        }
        return head;
    }
}
