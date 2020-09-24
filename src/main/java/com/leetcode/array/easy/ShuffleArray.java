package com.leetcode.array.easy;

/**
 * https://leetcode.com/problems/shuffle-the-array/submissions/
 */
public class ShuffleArray {

    public static int[] shuffle(int[] nums, int n) {
        int curr = 0, next = n, resIndex=0;
        int[] res = new int[nums.length];
        while (curr < n) {
            res[resIndex] = nums[curr];
            resIndex++;curr++;
            res[resIndex] = nums[next];
            resIndex++;next++;
        }
        return res;
    }
}
