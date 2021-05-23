package LinkedList;

public class SwapListNodesInPairs {

    public ListNode swapPairs(ListNode head) {

        if(head==null || head.next==null)
            return head;

        ListNode prev = head;
        ListNode curr = head.next;
        ListNode ans = head.next;

        while(true){

            ListNode next = curr.next;
            curr.next = prev;

            if(next==null || next.next==null){
                prev.next = next;
                break;
            }

            prev.next = next.next;
            prev = next;
            curr = prev.next;

        }


        return ans;

    }
      class ListNode {
      public int val;
     public ListNode next;
      ListNode(int x) { val = x; next = null; }
  }

}
