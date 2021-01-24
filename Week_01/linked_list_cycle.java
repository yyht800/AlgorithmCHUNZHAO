package com.jyh.deliver.app.week;


public class linked_list_cycle {

    public boolean hasCycle(ListNode head) {
        //if (head == null || head.next = null) return false;
        ListNode slow = head;
        ListNode quick = head;
        while (quick != null && quick.next != null) {
            slow = slow.next;
            quick = quick.next.next;
            if (slow == quick) return true;

        }

        return false;

    }
}
