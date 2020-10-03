package com.leetcode.lnkedlist.easy;

import com.leetcode.lnkedlist.ListNode;

public class ReverseLinkedList {

    public static ListNode reverseList(ListNode head) {
        return reverseUtil(head);
    }

    private static ListNode reverseUtil(ListNode head) {
        if (head.getNext() == null) {
            return head;
        }
        ListNode listNode = reverseUtil(head.getNext());
        head.next.next = head;
        head.next = null;
        return listNode;
    }
}
