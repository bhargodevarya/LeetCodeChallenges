package com.leetcode.array.easy;

public class DecompressRunLengthEncoded {

    public static int[] decompressRLElist(int[] nums) {
        int length = 0;
        for (int i=0; i<=nums.length-2; i += 2) {
            length += nums[i];
        }

        int[] result = new int[length];
        int startIndex =0;
        for (int i=0; i<=nums.length-2; i += 2) {
            int lastIndex = nums[i];
            for (int j = startIndex; j <=startIndex+lastIndex-1; j++) {
                result[j] = nums[i+1];
            }
            startIndex = lastIndex+startIndex;
        }

        return result;
    }
}
