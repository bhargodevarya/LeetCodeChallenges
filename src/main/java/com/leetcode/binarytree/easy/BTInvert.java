package com.leetcode.binarytree.easy;

import com.leetcode.binarytree.TreeNode;

/**
 * https://leetcode.com/problems/invert-binary-tree/
 */
public class BTInvert {

    public static TreeNode<Integer> invertTree(TreeNode<Integer> root) {
        if (root == null) {
            return null;
        }
        TreeNode left = root.left;
        TreeNode right = root.right;
        root.right = invertTree(left);
        root.left = invertTree(right);
        return root;
    }
}
