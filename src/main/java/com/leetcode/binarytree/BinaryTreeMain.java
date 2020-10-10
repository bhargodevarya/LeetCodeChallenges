package com.leetcode.binarytree;

import com.leetcode.binarytree.easy.BTHeight;
import com.leetcode.binarytree.easy.BTIdentical;
import com.leetcode.binarytree.easy.BTMirror;

public class BinaryTreeMain {

    public static void main(String[] args) {
        BinaryTree<Integer> bt = new BinaryTree<>(7);
        BinaryTree<Integer> b2left = new BinaryTree<>(4);
        BinaryTree<Integer> b2right = new BinaryTree<>(5);
        BinaryTree<Integer> b3left = new BinaryTree<>(9);
        BinaryTree<Integer> b4left = new BinaryTree<>(1);

        bt.left = b2left; bt.right = b2right;
        b2left.left = b3left;b3left.left = b4left;

        BinaryTree<Integer> bt2 = new BinaryTree<>(7);
        BinaryTree<Integer> bt2left = new BinaryTree<>(4);
        BinaryTree<Integer> bt2right = new BinaryTree<>(5);
        BinaryTree<Integer> bt3left = new BinaryTree<>(9);
        BinaryTree<Integer> bt4left = new BinaryTree<>(1);

        bt2.right = bt2left; bt2.left = bt2right;
        bt2left.right = bt3left;bt3left.right = bt4left;
        System.out.println(BTMirror.isMirrorTree(bt, bt2));
    }
}
