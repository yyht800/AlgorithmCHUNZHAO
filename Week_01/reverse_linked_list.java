package com.jyh.deliver.app.week;


public class reverse_linked_list {

    public ListNode reverseList(ListNode head) {
        ListNode pre = null;
        ListNode curr = head;
        ListNode node = head;

        while (curr != null) {
            node = curr.next;
            curr.next = pre;
            pre = curr;
            curr = node;
        }

        return pre;
    }
}
