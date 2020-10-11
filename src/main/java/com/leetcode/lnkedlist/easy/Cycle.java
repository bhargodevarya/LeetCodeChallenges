package com.leetcode.lnkedlist.easy;

import com.leetcode.lnkedlist.ListNode;

/**
 * https://leetcode.com/problems/linked-list-cycle/
 */
public class Cycle {

    public static boolean solve(ListNode head) {
        if (head == null)
            return false;
        ListNode fast = head, slow = head;

        while(fast != null && fast.next != null) {
            fast = fast.next.next;
            if (fast == null)
                return false;
            slow = slow.next;
            if (fast.equals(slow)) {
                return true;
            }
        }
        return false;
    }
}
