package com.leetcode.lnkedlist.easy;

import com.leetcode.lnkedlist.ListNode;

/**
 * Reverse in pair and return the last node
 */
public class ReverseInGroupOfK {

    public static void solve(ListNode node, int k) {
        node = solve2(node, 3);
        //node = recur(node);
        while (node != null) {
            System.out.println(node.val);
            node = node.next;
        }
    }

    public static ListNode solve2(ListNode node, int k) {
        if (node == null || node.next == null) {
            return node;
        }
        ListNode  kthNode = getKthNode(node, k);

        ListNode remaining = solve2(kthNode.next, k);

        ListNode reversed = reverse(node, kthNode);


        node.next = remaining;

        return reversed;
    }

    private static ListNode reverse(ListNode node, ListNode kthNode) {
        if (node == null || node.next == null || node.equals(kthNode))
            return node;

        ListNode reverse = reverse(node.next, kthNode);
        node.next.next = node;
        node.next = null;
        return reverse;
    }

    private static ListNode getKthNode(ListNode node, int k) {
        if (node == null || node.next == null || k == 1)
            return node;
        return getKthNode(node.next, k-1);
    }

    private static ListNode recur(ListNode node) {
        if (node == null || node.next == null) {
            return node;
        }
        ListNode first = node;
        ListNode sec = first.next;

        ListNode recur = recur(sec.next);

        sec.next = first;
        first.next = recur;
        return sec;
    }
}
