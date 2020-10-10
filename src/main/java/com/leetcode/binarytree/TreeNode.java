package com.leetcode.binarytree;

public class TreeNode<T> {

    public T val;
    public TreeNode left;
    public TreeNode right;

    public TreeNode(T val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }

    public TreeNode(T val) {
        this.val = val;
    }

    @Override
    public String toString() {
        return "val " + val + " left " + left + " right " + right;
    }
}
