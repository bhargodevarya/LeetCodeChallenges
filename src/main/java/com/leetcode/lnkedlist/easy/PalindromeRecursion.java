package com.leetcode.lnkedlist.easy;

import com.leetcode.lnkedlist.ListNode;

public class PalindromeRecursion {

    private static  ListNode HEAD;

    public static boolean isPalindrome(ListNode head) {
        HEAD = head;
        return getNext(head);
    }

    private static boolean getNext(ListNode listNode) {
        if (listNode == null) {
            return true;
        }
        boolean res = getNext(listNode.getNext());
        if (res == false) {
            return false;
        }
        boolean res2Ret = (listNode.getVal() == HEAD.getVal());
        HEAD = HEAD.getNext();
        return res2Ret;
    }
}
