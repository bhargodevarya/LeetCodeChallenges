package com.leetcode.binarytree;

import com.leetcode.binarytree.easy.BTInvert;
import com.leetcode.binarytree.easy.BTMirror;
import com.leetcode.binarytree.easy.RootToLeafSum;
import com.leetcode.binarytree.easy.SumTree;
import com.leetcode.binarytree.medium.SumEvenGrandparent;

public class BinaryTreeMain {

    public static void main(String[] args) {
        /*TreeNode<Integer> bt = new TreeNode<>(7);
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
        System.out.println(BTMirror.isMirrorTree(bt, bt2));*/

        /*TreeNode<Integer> b6 = new TreeNode<>(6);
        TreeNode<Integer> b7 = new TreeNode<>(7);
        TreeNode<Integer> b8 = new TreeNode<>(8);
        TreeNode<Integer> b2 = new TreeNode<>(2);
        TreeNode<Integer> b77 = new TreeNode<>(7);
        TreeNode<Integer> b1 = new TreeNode<>(1);
        TreeNode<Integer> b3 = new TreeNode<>(3);
        TreeNode<Integer> b9 = new TreeNode<>(9);
        TreeNode<Integer> b11 = new TreeNode<>(1);
        TreeNode<Integer> b4 = new TreeNode<>(4);
        TreeNode<Integer> b5 = new TreeNode<>(5);

        b2.left = b9;
        b77.left=b11;
        b77.right = b4;
        b3.right=b5;
        b7.left=b2;b7.right=b77;
        b8.left=b1;b8.right=b3;
        b6.left=b7;b6.right=b8;*/

        //System.out.println(SumEvenGrandparent.sumEvenGrandparent(b6));

        //RootToLeafSum.solve(b6).forEach(System.out::println);


        TreeNode<Integer> b26 = new TreeNode<>(26);
        TreeNode<Integer> b10 = new TreeNode<>(12);
        TreeNode<Integer> b3 = new TreeNode<>(3);
        TreeNode<Integer> b4 = new TreeNode<>(4);
        TreeNode<Integer> b6 = new TreeNode<>(6);
        TreeNode<Integer> b33 = new TreeNode<>(3);
         b10.left=b4;b10.right=b6;
         b3.right=b33;
         b26.left=b10;b26.right=b3;

        System.out.println(SumTree.solve(b26));



    }
}
