package com.leetcode.binarytree.easy;

import com.leetcode.binarytree.TreeNode;

/**
 * https://leetcode.com/problems/maximum-depth-of-binary-tree/
 */
public class BTHeight {

    public static int solve(TreeNode<Integer> treeNode) {
        if (treeNode == null) {
            return 0;
        }
        return Math.max(solve(treeNode.left), solve(treeNode.right)) +1;
    }
}
