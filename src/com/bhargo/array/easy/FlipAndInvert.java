package com.bhargo.array.easy;

/**
 * https://leetcode.com/problems/flipping-an-image/
 */
public class FlipAndInvert {

    public static int[][] flipAndInvertImage(int[][] A) {
        if (A.length == 1) {
            return A;
        }
        for (int i =0; i < A.length; i++) {
            A[i] = rotateAndInvert(A[i]);
        }
        return A;
    }

    private static int[] rotateAndInvert(int[] arr) {
        int[] res = new int[arr.length];
        for (int i = arr.length-1; i >=0; i--) {
            res[arr.length-1 - i] = arr[i] == 0 ? 1 : 0;
        }
        return res;
    }


}
