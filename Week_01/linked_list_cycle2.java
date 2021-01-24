package com.jyh.deliver.app.week;

public class linked_list_cycle2 {
    public ListNode detectCycle(ListNode head) {
        ListNode slow = head;
        ListNode quick = head;
        while (true) {
            if (quick == null || quick.next == null) return null;
            slow = slow.next;
            quick = quick.next.next;
            if (slow == quick) break;
        }
        quick = head;
        while (quick != slow) {
            quick = quick.next;
            slow = slow.next;
        }

        return slow;
    }
}
