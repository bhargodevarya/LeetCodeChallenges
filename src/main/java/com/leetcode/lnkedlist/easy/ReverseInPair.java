package com.leetcode.lnkedlist.easy;

import com.leetcode.lnkedlist.ListNode;

public class ReverseInPair {

    public static void solve(ListNode node) {
        node = recur(node);
        while (node != null) {
            System.out.println(node.val);
            node = node.next;
        }
    }

    private static ListNode recur(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        ListNode first = head;
        ListNode sec = first.next;

        ListNode recur = recur(sec.next);

        sec.next = first;
        first.next = recur;
        return sec;
    }
}
