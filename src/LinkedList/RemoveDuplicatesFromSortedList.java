package LinkedList;

public class RemoveDuplicatesFromSortedList {
    public ListNode deleteDuplicates(ListNode head) {

        ListNode curr = head;

        while(curr!=null && curr.next!=null){

            if(curr.val==curr.next.val)
                curr.next = curr.next.next;
            else
                curr = curr.next;

        }

        return head;


    }
     class ListNode {
      public int val;
      public ListNode next;
      ListNode(int x) { val = x; next = null; }
  }
}
