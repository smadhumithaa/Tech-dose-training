class Solution {
    public ListNode reverseList(ListNode head) {
        ListNode temp=head;
        ListNode prev=null;
        ListNode ani=null;
        while(temp!=null){
            ani=temp.next;
            temp.next=prev;
            prev=temp;
            temp=ani;
        }
        head=prev;
        return head;
    }
}
