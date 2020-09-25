package com.leetcode.array.easy;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

/**
 * https://leetcode.com/problems/number-of-good-pairs/
 */
public class GoodPairs {

    public static int numIdenticalPairs(int[] nums) {
        Map<Integer, Integer> count = new HashMap<>();
        for(int i =nums.length-1; i >=0; i--) {
            if (count.containsKey(nums[i])) {
                count.put(nums[i], count.get(nums[i])+1);
            } else {
                count.put(nums[i], 0);
            }
        }
        int res = 0;
        Collection<Integer> values = count.values();
        for (Integer in: values) {
            for (int i = 1; i <=in; i++) {
                res +=i;
            }
        }
        return res;
    }
}
