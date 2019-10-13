package com.bhargo.array.easy;

/**
 * https://leetcode.com/problems/squares-of-a-sorted-array
 */
public class SortedSquares {

    public static int[] sortedSquares(int[] A) {
        int[] res = new int[A.length];
        int firstPosNumber = getPosLocation(A);
        if (firstPosNumber == 0) {
            for (int i = 0 ; i < A.length; i++) {
                res[i] = A[i]*A[i];
            }

        } else {
            int backPtr = firstPosNumber -1;
            int fwdPtr = firstPosNumber;
            int index = 0, backSqr, fwdSqr;
            boolean exhaustedBP = false, exhaustedFP = false;
            while (index <= A.length -1) {
                if (backPtr < 0) {
                    exhaustedBP = true;
                }
                if (fwdPtr > A.length -1) {
                    exhaustedFP = true;
                }

                if (exhaustedBP) {
                    res[index] = Math.abs(A[fwdPtr]*A[fwdPtr]);
                    fwdPtr++;
                    index++;
                    continue;
                }

                if (exhaustedFP) {
                    res[index] = Math.abs(A[backPtr]*A[backPtr]);
                    backPtr--;
                    index++;
                    continue;
                }

                backSqr = Math.abs(A[backPtr]*A[backPtr]);
                fwdSqr = Math.abs(A[fwdPtr]*A[fwdPtr]);
                if (backSqr < fwdSqr) {
                    res[index] = backSqr;
                    backPtr--;
                    index++;
                } else if (fwdSqr < backSqr){
                    res[index] = fwdSqr;
                    fwdPtr++;
                    index++;
                } else {
                    res[index] =backSqr;
                    res[index+1] = fwdSqr;
                    index +=2;
                    fwdPtr++;
                    backPtr--;
                }
            }
        }

        return res;
    }

    private static int getPosLocation(int[] arr) {
        for (int i =0; i < arr.length; i++) {
            if (arr[i] >= 0) {
                return i;
            }
        }
        return 0;
    }
}
