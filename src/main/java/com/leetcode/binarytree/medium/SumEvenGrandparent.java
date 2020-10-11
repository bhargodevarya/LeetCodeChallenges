package com.leetcode.binarytree.medium;

import com.leetcode.binarytree.TreeNode;

import java.util.ArrayList;
import java.util.List;

/**
 * https://leetcode.com/problems/sum-of-nodes-with-even-valued-grandparent/
 *
 * Input: root = [6,7,8,2,7,1,3,9,null,1,4,null,null,null,5]
 * Output: 18
 *
 *                      6
 *              7              8
 *         2         7    1         3
 *       9         1   4               5
 */
public class SumEvenGrandparent {

    public static int sumEvenGrandparent(TreeNode root) {
        int result = 0;
        result = recur(root);
        return result;
    }

    private static int recur(TreeNode<Integer> root) {
        if (root == null) {
            return 0;
        }
        if (root.val%2 == 0) {
            List<TreeNode<Integer>> gcs = getGrandChild(root);
            int result = 0;
            for (TreeNode<Integer> node: gcs) {
                result += node.val;
            }
            return result + recur(root.left) + recur(root.right);
        } else {
            return recur(root.left) + recur(root.right);
        }
    }

    private static List<TreeNode<Integer>> getGrandChild(TreeNode<Integer> root) {
        if (root == null) {
            return  null;
        }
        List<TreeNode<Integer>> result = new ArrayList<>();
        if (root.left != null) {
            if (root.left.left != null) {
                result.add(root.left.left);
            }
            if (root.left.right != null) {
                result.add(root.left.right);
            }
        }
        if (root.right != null) {
            if (root.right.left != null) {
                result.add(root.right.left);
            }
            if (root.right.right != null) {
                result.add(root.right.right);
            }
        }
        return result;
    }
}
