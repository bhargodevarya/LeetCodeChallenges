package com.leetcode.binarytree.medium;

import com.leetcode.binarytree.TreeNode;

/**
 * https://leetcode.com/problems/find-a-corresponding-node-of-a-binary-tree-in-a-clone-of-that-tree/
 */
public class ClonedTreeCorrespondingNode {

    public final TreeNode getTargetCopy(final TreeNode original, final TreeNode cloned, final TreeNode<Integer> target) {
        if (original == null || cloned == null || target == null)
            return null;
        int val = target.val;
        TreeNode result = find(cloned, val);
        return result;
    }

    private TreeNode find(TreeNode<Integer> node, int val) {
        if (node == null) {
            return null;
        }
        if (node.val == val) {
            return node;
        }
        TreeNode leftResult = find(node.left, val);
        return leftResult != null ? leftResult : find(node.right, val);
    }
}
