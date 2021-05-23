package LinkedList;

import LinkedList.ListNode;

public class AddTwoNumbersAsLists {
    public ListNode addTwoNumbers(ListNode A, ListNode B) {

        ListNode head = new ListNode(0);
        ListNode curr = head;

        int carry = 0;

        while (A != null || B != null) {

            int x = 0;
            int y = 0;

            if (A != null)
                x = A.val;

            if (B != null)
                y = B.val;


            int z = x + y + carry;

            carry = 0;

            if (z / 10 == 1)
                carry = 1;

            curr.next = new ListNode(z % 10);
            curr = curr.next;
            if (A != null)
                A = A.next;
            if (B != null)
                B = B.next;
        }


        if (carry == 1)
            curr.next = new ListNode(carry);

        return head.next;


    }    }
