package com.leetcode.binarytree.easy;

import com.leetcode.binarytree.BinaryTree;

/**
 * https://leetcode.com/problems/maximum-depth-of-binary-tree/
 */
public class BTHeight {

    public static int solve(BinaryTree<Integer> binaryTree) {
        if (binaryTree == null) {
            return 0;
        }
        return Math.max(solve(binaryTree.left), solve(binaryTree.right)) +1;
    }
}
