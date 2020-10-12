package com.leetcode.binarytree.easy;

import com.leetcode.binarytree.TreeNode;
import com.leetcode.lnkedlist.ListNode;

import java.util.ArrayList;
import java.util.List;

public class RootToLeafSum {

    public static List<Integer> solve(TreeNode<Integer> node) {
        List<Integer> result = new ArrayList<>();
        solveUtil(node, result, 0);
        return result;
    }

    private static void solveUtil(TreeNode<Integer> node, List<Integer> result, int currentSum) {
        if (node == null) {
            return;
        }
        if (node.left == null && node.right == null) {
            result.add(currentSum+node.val);
            return;
        }
        currentSum += node.val;
        solveUtil(node.left, result, currentSum);
        solveUtil(node.right, result, currentSum);
    }
}
