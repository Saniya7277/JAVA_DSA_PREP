class Solution {
    public int getLength(ListNode head) {
        // Your code goes here
        int count=0;
        if (head==null){
         return 0;
        }
        else{
            ListNode curr=head;
            while(curr!=null){
                count++;
                curr=curr.next;
                
            }

        }
        return count;
    }
}
