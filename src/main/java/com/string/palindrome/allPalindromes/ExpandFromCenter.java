package com.string.palindrome.allPalindromes;

import java.util.HashSet;
import java.util.Set;

public class ExpandFromCenter {

    private static Set<String> existing = new HashSet<>();

    public static void main(String[] args) {
        solve("ABBA");
        existing.forEach(System.out::println);
    }

    private static void solve(String str) {
        for (int i = 0; i < str.length(); i++) {
            expand(str, i,i);
            expand(str, i,i+1);
        }
    }

    private static void expand(String str, int start, int end) {
        while (start >=0 && end<=str.length() -1 && str.charAt(start) == str.charAt(end)) {
            existing.add(str.substring(start, end+1));
            start--; end++;
        }
    }
}
