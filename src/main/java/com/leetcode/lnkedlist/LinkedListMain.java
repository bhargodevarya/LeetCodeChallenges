package com.leetcode.lnkedlist;

import com.leetcode.lnkedlist.easy.ReverseInGroupOfK;

public class LinkedListMain {

    public static void main(String[] args) {
        ListNode listNode = new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4, new ListNode(5)))));
        ReverseInGroupOfK.solve(listNode, 2);
    }
}
