package com.leetcode.binarytree.easy;

import com.leetcode.binarytree.TreeNode;

public class SumTree {

    public static boolean solve(TreeNode<Integer> node) {
        return solveUtil(node).flag;
    }

    private static Result solveUtil(TreeNode<Integer> node) {
        if (node == null) {
            return new Result(true, 0);
        }
        if (node.left == null && node.right == null) {
            return new Result(true, node.val);
        }
        Result lr = solveUtil(node.left);
        Result rr = solveUtil(node.right);
        return new Result(lr.sum + rr.sum == node.val ? true : false, lr.sum+rr.sum+node.val);
    }

    static class Result {
        boolean flag;
        int sum;

        public Result(boolean flag, int sum) {
            this.flag = flag;
            this.sum = sum;
        }

        public boolean isFlag() {
            return flag;
        }

        public void setFlag(boolean flag) {
            this.flag = flag;
        }

        public int getSum() {
            return sum;
        }

        public void setSum(int sum) {
            this.sum = sum;
        }
    }
}
