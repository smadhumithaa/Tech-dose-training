public class Solution {
    public ListNode detectCycle(ListNode head) {
        if(head==null || head.next==null){            
            return null;
        }
        ListNode slow = head;
        ListNode fast = head;
        
        slow = slow.next;
        fast = fast.next.next;
        
        while(slow!=fast){
            if(fast==null || fast.next==null || fast.next.next==null){
                return null;
            }
            slow = slow.next;
            fast = fast.next.next;
        }
								// once we get the common node where slow and fast met. 
								// we will put one of the ListNode to the head again and move 
								// pointer each time for both;
        
        // fast = head; // this is also correct
        slow = head;
        while(slow!=fast){
            slow = slow.next;
            fast = fast.next;
        }
        
        return slow;
    }
}
