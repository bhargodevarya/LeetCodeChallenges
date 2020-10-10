package com.leetcode.binarytree;

public class BinaryTree<T> {

    public T value;
    public BinaryTree left;
    public BinaryTree right;

    public BinaryTree(T value, BinaryTree left, BinaryTree right) {
        this.value = value;
        this.left = left;
        this.right = right;
    }

    public BinaryTree(T value) {
        this.value = value;
    }
}
