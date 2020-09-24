package com.leetcode.array.easy;

import java.util.ArrayList;
import java.util.List;

/**
 * https://leetcode.com/problems/kids-with-the-greatest-number-of-candies/
 */
public class KidsWithCandies {

    public static List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int max = 0;
        for (int i = 0; i < candies.length; i++) {
            max = candies[i] > max ? candies[i] : max;
        }
        List<Boolean> result = new ArrayList<>(candies.length);
        for (int i = 0; i < candies.length; i++) {
            if (candies[i]+extraCandies >= max) {
                result.add(i, true);
            } else {
                result.add(i, false);
            }
        }
        return result;
    }
}
