package LinkedList;

public class RotateList {

    public ListNode rotateRight(ListNode A, int k) {

        int len = length(A);

        if(len==0)
            return A;

        if(len==k)
            return A;

        k = k%len;
        if(k==0)
            return A;

        ListNode currHead = A,oldHead = A, prev = A;

        for(int i=1;i<=len - k ;i++){
            prev = currHead;
            currHead = currHead.next;

        }
        prev.next = null;

        ListNode curr = currHead;
        while(curr.next!=null)
            curr = curr.next;


        curr.next = oldHead;
        return currHead;

    }
    private int length(ListNode root){


        int count = 0 ;

        ListNode curr = root;

        while(curr!=null){
            count++;
            curr = curr.next;

        }

        return count;

    }

    }
