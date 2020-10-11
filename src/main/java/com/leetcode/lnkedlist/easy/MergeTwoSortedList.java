package com.leetcode.lnkedlist.easy;

import com.leetcode.lnkedlist.ListNode;

public class MergeTwoSortedList {

    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        if (l1 == null && l2 != null) {
            return l2;
        }
        if (l1 != null && l2 == null) {
            return l1;
        }
        if (l1 == null && l2 == null) {
            return null;
        }
        ListNode result = new ListNode(0);
        ListNode head = result;
        while (l1 != null && l2 != null) {
            if (l1.val < l2.val) {
                result.next = new ListNode(l1.val);
                result = result.next;
                l1 = l1.next;
            } else if (l2.val < l1.val) {
                result.next = new ListNode(l2.val);
                result = result.next;
                l2 = l2.next;
            } else {
                result.next = new ListNode(l1.val);
                result = result.next;
                result.next = new ListNode(l1.val);
                result = result.next;
                l1 = l1.next;
                l2 = l2.next;
            }
        }
        if (l1 != null) {
            result.next = l1;
        }
        if (l2 != null) {
            result.next = l2;
        }
        return head.next;
    }
}
