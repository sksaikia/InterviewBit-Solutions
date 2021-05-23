package LinkedList;

public class ReOrderList {

    public ListNode reorderList(ListNode head) {

        if(head==null || head.next==null)
            return head;

        ListNode slow = head,fast = head;


        while(fast!=null && fast.next!=null){

            fast = fast.next.next;
            slow = slow.next;

        }

        slow = reverse(slow);

        fast = slow.next;
        slow.next = null;


        ListNode newHead = new ListNode(0);

        ListNode curr = newHead;

        while(head!=null || fast!=null){

            if(head!=null){
                curr.next = head;
                head = head.next;
                curr = curr.next;
            }

            if(fast!=null){
                curr.next = fast;
                fast = fast.next;
                curr = curr.next;
            }

        }


        return newHead.next;



    } private ListNode reverse(ListNode head){

        ListNode prev=null,next=null,curr = head;

        while(curr!=null){

            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;

        }

        return prev;


    }
    class ListNode {
        public int val;
        public ListNode next;
        ListNode(int x) { val = x; next = null; }
    }

}

