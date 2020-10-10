package com.leetcode.binarytree.easy;

import com.leetcode.binarytree.BinaryTree;

/**
 * https://leetcode.com/problems/same-tree/c
 */
public class BTIdentical {

    public static boolean isSameTree(BinaryTree<Integer> p, BinaryTree<Integer> q) {
        if (p == null && q == null) {
            return true;
        }
        if (p == null && q != null) {
            return false;
        }
        if (p != null && q == null) {
            return false;
        }
        return p.value.equals(q.value) && isSameTree(p.left, q.left) && isSameTree(p.right, q.right);
    }
}
