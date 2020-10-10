package com.leetcode.binarytree;

import com.leetcode.binarytree.easy.BTHeight;

public class BinaryTreeMain {

    public static void main(String[] args) {
        BinaryTree<Integer> bt = new BinaryTree<>(7);
        BinaryTree<Integer> b2left = new BinaryTree<>(4);
        BinaryTree<Integer> b2right = new BinaryTree<>(5);
        BinaryTree<Integer> b3left = new BinaryTree<>(9);
        BinaryTree<Integer> b4left = new BinaryTree<>(1);
        bt.left = b2left; bt.right = b2right;
        b2left.left = b3left;b3left.left = b4left;
        System.out.println(BTHeight.solve(bt));
    }
}