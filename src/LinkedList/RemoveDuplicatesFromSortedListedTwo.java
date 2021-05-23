package LinkedList;

public class RemoveDuplicatesFromSortedListedTwo {

    public ListNode deleteDuplicates(ListNode A) {

        ListNode head = new ListNode(0);
        head.next = A;
        ListNode curr = head;

        ListNode prev = head;

        while(curr!=null) {


            while(curr.next!=null && prev.next.val==curr.next.val)
                curr = curr.next;


            if(prev.next==curr)
                prev = prev.next;
            else
                prev.next = curr.next;


            curr = curr.next;


        }


        return head.next;

    }

}
