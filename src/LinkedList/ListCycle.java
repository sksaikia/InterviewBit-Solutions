package LinkedList;

import LinkedList.ListNode;

public class ListCycle {
    public ListNode detectCycle(ListNode head) {

        if(head==null)
            return null;

        ListNode slow = head;
        ListNode fast = head;


        boolean state = false;

        while(fast!=null && fast.next!=null){

            fast = fast.next.next;
            slow = slow.next;

            if(fast==slow){
                state = true;
                break;
            }

        }

        if(state==false)
            return null;


        slow = head;

        while(slow!=fast){
            slow = slow.next;
            fast = fast.next;
        }

        return slow;}
}
