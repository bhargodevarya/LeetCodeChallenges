package com.leetcode.binarytree;

import com.leetcode.binarytree.easy.BTInvert;
import com.leetcode.binarytree.easy.BTMirror;

public class BinaryTreeMain {

    public static void main(String[] args) {
        TreeNode<Integer> bt = new TreeNode<>(7);
        TreeNode<Integer> b2left = new TreeNode<>(4);
        TreeNode<Integer> b2right = new TreeNode<>(5);
        TreeNode<Integer> b3left = new TreeNode<>(9);
        TreeNode<Integer> b4left = new TreeNode<>(1);

        bt.left = b2left; bt.right = b2right;
        b2left.left = b3left;b3left.left = b4left;

        TreeNode<Integer> bt2 = new TreeNode<>(7);
        TreeNode<Integer> bt2left = new TreeNode<>(4);
        TreeNode<Integer> bt2right = new TreeNode<>(5);
        TreeNode<Integer> bt3left = new TreeNode<>(9);
        TreeNode<Integer> bt4left = new TreeNode<>(1);

        bt2.right = bt2left; bt2.left = bt2right;
        bt2left.right = bt3left;bt3left.right = bt4left;
        System.out.println(BTMirror.isMirrorTree(bt, bt2));
    }
}
