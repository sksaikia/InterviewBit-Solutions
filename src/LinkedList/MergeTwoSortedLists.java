package LinkedList;

public class MergeTwoSortedLists {

    public ListNode mergeTwoLists(ListNode A, ListNode B) {

        ListNode head = new ListNode(0);

        ListNode curr = head;

        while(A!=null && B!=null){

            int x = 0,y = 0;

            if(A!=null)
                x = A.val;
            if(B!=null)
                y = B.val;


            if(x<y)
                curr.next = new ListNode(x);
            else
                curr.next = new ListNode(y);

            curr = curr.next;

            A = A.next;
            B = B.next;


        }
        while(A!=null){
            curr.next = A;
            A = A.next;
            curr = curr.next;

        }

        while(B!=null){
            curr.next = B;
            B = B.next;
            curr = curr.next;
        }

        return head.next;




    }
    class ListNode {
      public int val;
     public ListNode next;
     ListNode(int x) { val = x; next = null; }
 }

}
