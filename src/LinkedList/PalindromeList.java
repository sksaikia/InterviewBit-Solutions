package LinkedList;

public class PalindromeList {
    public int lPalin(ListNode head) {

        ListNode curr = head;

        ListNode fast = head,slow = head,prev= head;

        while(fast!=null && fast.next!=null){

            fast = fast.next.next;
            prev = slow;
            slow = slow.next;

        }

        ListNode newNode = null;
        ListNode oldNode = head;

        if(fast==null){
            newNode = reverse(slow);
            prev.next = null;

        }else{

            prev.next = null;
            newNode = reverse(slow.next);


        }


        return compare(newNode,oldNode);

    }


    public int compare(ListNode newNode,ListNode oldNode){

        while(newNode!=null && oldNode!=null){
            if(newNode.val!=oldNode.val)
                return 0;

            newNode = newNode.next;
            oldNode = oldNode.next;

        }


        return 1;

    }







    public ListNode reverse(ListNode head){

        ListNode curr = head;
        ListNode prev = null,next = null;


        while(curr!=null){

            next = curr.next;

            curr.next = prev;
            prev = curr;


            curr = next;


        }



        return prev;
    }

}
