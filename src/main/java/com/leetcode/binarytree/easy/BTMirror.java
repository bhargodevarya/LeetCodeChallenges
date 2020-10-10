package com.leetcode.binarytree.easy;

import com.leetcode.binarytree.BinaryTree;

/**
 * Same as the problem of identical BTs, only the nodes passed are opposite.
 */
public class BTMirror {

    public static boolean isMirrorTree(BinaryTree<Integer> p, BinaryTree<Integer> q) {
        if (p == null && q == null) {
            return true;
        }
        if (p == null && q != null) {
            return false;
        }
        if (p != null && q == null) {
            return false;
        }
        return p.value.equals(q.value) && isMirrorTree(p.right, q.left) && isMirrorTree(p.left, q.right);
    }
}
