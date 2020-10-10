package com.leetcode.binarytree.easy;

import com.leetcode.binarytree.TreeNode;

/**
 * https://leetcode.com/problems/subtree-of-another-tree/
 */
public class BTSubtree {

    public static  boolean isSubtree(TreeNode s, TreeNode t) {
        if (s == null && t != null) {
            return false;
        }
        if (s != null && t == null) {
            return false;
        }
        if (subTreeUtil(s,t)) {
            return true;
        }
        return isSubtree(s.left, t) || isSubtree(s.right, t);
    }

    private static boolean subTreeUtil(TreeNode<Integer> s, TreeNode<Integer> t) {
        if (s == null && t == null) {
            return true;
        }
        if (s == null && t != null) {
            return false;
        }
        if (s != null && t == null) {
            return false;
        }

        return s.val == t.val && subTreeUtil(s.right, t.right) && subTreeUtil(s.left, t.left);
    }
}
