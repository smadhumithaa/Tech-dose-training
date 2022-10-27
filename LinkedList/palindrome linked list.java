class Solution {
    public boolean isPalindrome(ListNode head) {
        StringBuilder sb=new StringBuilder(""); 
        StringBuilder ss=new StringBuilder(""); 
        char ch=(char)(head.val+'0');
        while(head!=null){
            sb.append((char)(head.val+'0'));
            ss.append((char)(head.val+'0'));
            head=head.next;
        }
        
        ss.reverse();
        System.out.println(ss+" "+sb);
        if(sb.toString().equals(ss.toString()))
        return true;
        return false;
    }
}
