package com.leetcode.binarytree.easy;

import com.leetcode.binarytree.TreeNode;

/**
 * https://leetcode.com/problems/diameter-of-binary-tree/
 */
public class BTDiameter {
    public int diameterOfBinaryTree(TreeNode<Integer> root) {
        int lHeight = height(root.left);
        int rHeight = height(root.right);

        //diff in LC and GFG. In GFG lHeight+rHeight+1
        return Math.max(lHeight+rHeight, Math.max(diameterOfBinaryTree(root.left), diameterOfBinaryTree(root.right)));

    }

    private int height(TreeNode node) {
        if (node == null) {
            return 0;
        }
        return Math.max(height(node.left), height(node.right))+1;
    }
}
