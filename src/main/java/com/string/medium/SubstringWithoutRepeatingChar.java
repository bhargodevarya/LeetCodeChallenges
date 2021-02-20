package com.string.medium;

import java.util.HashMap;
import java.util.Map;

/**
 * https://leetcode.com/problems/longest-substring-without-repeating-characters/
 */
public class SubstringWithoutRepeatingChar {

    public static void main(String[] args) {
        int result = solve("busvutpwmu");
        System.out.println(result);
    }

    private static int solve(String str) {
        if (str.length() == 0)
            return 0;
        int i =0, j =0;
        int maxWindow = Integer.MIN_VALUE;
        Map<String, Integer> map = new HashMap<>();
        while (i <=j && j < str.length()) {
            String current = str.substring(j, j + 1);
            if (!map.containsKey(current)) {
                map.put(current, j);
                maxWindow = Math.max(maxWindow, j-i+1);
                j++;
            } else {
                if (current.equals(str.substring(i, i+1))) {
                    i++;
                    map.put(current, j);
                } else {
                    while(!str.substring(i, i+1).equals(current)) {
                        map.remove(str.substring(i, i+1));
                        i++;
                    }
                    i = map.get(current) +1;
                    map.put(current, j);
                }
                maxWindow = Math.max(maxWindow, j-i+1);
                j++;
            }
        }
        return maxWindow;
    }
}
