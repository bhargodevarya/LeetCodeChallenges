package com.bhargo.array.easy;

import java.util.Arrays;
import java.util.HashSet;

/**
 * https://leetcode.com/problems/k-diff-pairs-in-an-array/
 */
public class KDiffPairs {

    public static int findPairs(int[] nums, int k) {

        Arrays.sort(nums);int count =0;
        HashSet<Integer> set = new HashSet<>();
        int index;
        for (int i = 0; i <= nums.length-2; i++) {
            index = i+1;
            while (index <= nums.length-1 && Math.abs(nums[index] - nums[i]) <= k) {
                if (Math.abs(nums[index] - nums[i]) == k &&
                        (!set.contains(nums[index]))) {
                    count++;
                    set.add(nums[index]);
                    break;
                }
                index++;
            }
        }
        return count;
    }
}
