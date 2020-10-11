package com.leetcode.lnkedlist.easy;

import com.leetcode.lnkedlist.ListNode;

/**
 * https://leetcode.com/problems/linked-list-cycle-ii/
 */
public class CycleStartingNode {

    public ListNode detectCycle(ListNode head) {
        if (head == null)
            return null;
        ListNode fast = head, slow = head;

        while(fast != null && fast.next != null) {
            fast = fast.next.next;
            if (fast == null)
                return null;
            slow = slow.next;
            if (fast.equals(slow)) {
                fast = head;
                while(!slow.equals(fast)) {
                    fast = fast.next;
                    slow = slow.next;
                }
                return fast;
            }
        }
        return null;
    }
}
