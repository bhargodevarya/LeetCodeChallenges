package com.leetcode.binarytree.easy;

import com.leetcode.binarytree.TreeNode;

/**
 * Same as the problem of identical BTs, only the nodes passed are opposite.
 */
public class BTMirror {

    public static boolean isMirrorTree(TreeNode<Integer> p, TreeNode<Integer> q) {
        if (p == null && q == null) {
            return true;
        }
        if (p == null && q != null) {
            return false;
        }
        if (p != null && q == null) {
            return false;
        }
        return p.val.equals(q.val) && isMirrorTree(p.right, q.left) && isMirrorTree(p.left, q.right);
    }
}
