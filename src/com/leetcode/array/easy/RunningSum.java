package com.leetcode.array.easy;

/**
 * https://leetcode.com/problems/running-sum-of-1d-array/
 */
public class RunningSum {

        public static int[] runningSum(int[] nums) {
            int currCount = 0;
            for (int i = 0; i <nums.length; i++) {
                nums[i] = nums[i]+currCount;
                currCount = nums[i];
            }
            return nums;
        }
}
