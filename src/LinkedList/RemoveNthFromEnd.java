package LinkedList;

public class RemoveNthFromEnd {
    public ListNode removeNthFromEnd(ListNode A, int k) {

        ListNode fast = A;

        for(int i=0;i<k;i++)
            fast = fast.next;

        ListNode prev = null;
        ListNode curr = A;

        while(fast!=null){

            fast = fast.next;
            prev = curr;
            curr = curr.next;


        }

        if(prev==null)
            return A.next;

        prev.next = curr.next;

        return A;


    }
}
