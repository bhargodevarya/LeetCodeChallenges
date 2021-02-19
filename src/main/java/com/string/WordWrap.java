package com.string;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * https://leetcode.com/problems/word-break/
 */
public class WordWrap {

    private static Map<String, Boolean> map = new HashMap<>();

    public static void main(String[] args) {
        solve("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa",
                Arrays.asList("a","aa","aaa","aaaa","aaaaa","aaaaaa","aaaaaaa","aaaaaaaa","aaaaaaaaa","aaaaaaaaaa"));
    }

    private static void solve(String word, List<String> dictionary) {

        System.out.println(recur(word, dictionary));
    }

    private static boolean recur2(String s, List<String> dictionary) {
        if (s.equals(""))
            return true;
        if (map.containsKey(s))
            return map.get(s);
        if (dictionary.contains(s))
            return true;

        for (int i =1; i < s.length(); i++) {
            String current = s.substring(0, i);
            if (dictionary.contains(current) && recur2(s.substring(i), dictionary)) {
                map.put(s.substring(i), true);
                return true;
            }
        }
        map.put(s, false);
        return false;
    }

    private static boolean recur(String s, List<String> dictionary) {
        if (s.length() == 0) {
            return true;
        }
        if (dictionary.contains(s)) {
            return true;
        }
        if (map.containsKey(s)) {
            return map.get(s);
        }

        for (int i = 1; i < s.length(); i++) {
            String current = s.substring(0, i);
            String rest = s.substring(i);
            if (!dictionary.contains(current)) {
                continue;
            }

            //current string is in the dictionary, check for the rest
            boolean ans = recur(rest, dictionary);
            map.put(rest, ans);
            if (ans) {
                map.put(s, true);
                return true;
            }
        }
        map.put(s, false);
        return false;
    }
}
