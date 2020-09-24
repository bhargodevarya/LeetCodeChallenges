package com.leetcode.array.easy;

/**
 * https://leetcode.com/problems/non-decreasing-array/
 */
public class NonDecArray {

    public static boolean checkPossibility(int[] nums) {

        int min = nums[nums.length-1];
        int count = 0;

        for (int i = nums.length-1; i >=0; i--) {
            if (count >1)
                break;
            if (nums[i] <= min) {
                min = nums[i];
            } else {
                if (i != 0)
                nums[i] = Math.min(nums[i-1], nums[i+1]);
                count++;
            }
        }

        return count<=1;
        /*int fixedCount = 0;
        for (int i = nums.length-1; i >0; i--) {
            if (fixedCount > 1)
                break;
            if (nums[i] >= nums[i-1]) {
                continue;
            }
            nums[i] = Math.min(nums[i-1], nums[i+1]);
            fixedCount++;
        }

        return fixedCount <= 1;*/
    }

    private static boolean checkCond(int[] nums, int i) {
        return nums[i] <= nums[i+1];
    }
}
