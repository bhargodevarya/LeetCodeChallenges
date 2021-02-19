package com.string.palindrome.allPalindromes;

import java.util.HashSet;
import java.util.Set;

public class BasicRecursion2 {

    private static Set<String> existing = new HashSet<>();
    private static int count = 0;

    public static void main(String[] args) {
        solve("NITIN");
        existing.forEach(System.out::println);
        System.out.println("Called " + count);
    }

    private static void solve(String str) {
        if (str.length() == 0) {
            return;
        }

        //System.out.println("Received " + str);

        for (int i =0; i < str.length(); i++) {
            String currentString = str.substring(0, i+1);
            //System.out.println("Processing part " + currentString);
            if (existing.contains(currentString)) {
                solve(str.substring(i+1));
            } else {
                boolean result = condition(currentString);
                if (result) {
                    existing.add(currentString);
                    solve(str.substring(i+1));
                }
            }
        }
    }

    private static boolean condition(String currentString) {
        count++;
        int low = 0, high = currentString.length()-1;
        boolean result = false;
        while (low  <= high) {
            if (currentString.charAt(low) == currentString.charAt(high)) {
                low++;high--;
                result = true;
            } else {
                result = false;
                break;
            }
        }
        return result;
    }
}
