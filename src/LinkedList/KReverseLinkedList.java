package LinkedList;

public class KReverseLinkedList {
    public ListNode reverseList(ListNode head, int k) {

        ListNode curr = head,prev = null,next=null;
        int count = k;

        while(curr!=null && count>0){
            count--;
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }

        if(next!=null)
            head.next = reverseList(next,k);


        return prev;
    }
}
