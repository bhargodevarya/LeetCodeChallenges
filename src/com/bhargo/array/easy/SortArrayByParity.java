package com.bhargo.array.easy;

/**
 * https://leetcode.com/problems/sort-array-by-parity
 */
public class SortArrayByParity {

    public static int[] sortByParity(int[] A) {
        int swapIndex = 0;
        for (int i =0; i < A.length; i++) {
            if (A[i] % 2 != 0) {
                swapIndex = i+1;
                swapIndex = getNextOddIndex(A, swapIndex);
                if (swapIndex != -1) {
                    A[i] = A[i] + A[swapIndex];
                    A[swapIndex] = A[i] - A[swapIndex];
                    A[i] = A[i] - A[swapIndex];
                }
            }
        }
        return A;
    }

    private static int getNextOddIndex(int[] A, int start) {
        for (int i = start; i<= A.length-1; i++) {
            if (A[i] % 2 == 0) {
                return i;
            }
        }
        return -1;
    }
}
