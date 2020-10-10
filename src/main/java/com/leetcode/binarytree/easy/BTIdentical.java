package com.leetcode.binarytree.easy;

import com.leetcode.binarytree.TreeNode;

/**
 * https://leetcode.com/problems/same-tree/
 */
public class BTIdentical {

    public static boolean isSameTree(TreeNode<Integer> p, TreeNode<Integer> q) {
        if (p == null && q == null) {
            return true;
        }
        if (p == null && q != null) {
            return false;
        }
        if (p != null && q == null) {
            return false;
        }
        return p.val.equals(q.val) && isSameTree(p.left, q.left) && isSameTree(p.right, q.right);
    }
}
