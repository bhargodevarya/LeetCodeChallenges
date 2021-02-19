package com.string.parentheses;

public class GenerateAllParentheses {

    public static void main(String[] args) {
        solve(2);
    }

    private static void solve(int n) {
        int open = n, close =n;
        recur2(n, open, close, "");
    }

    private static void recur2(int n, int openingCount, int closingCount, String result) {
        if (result.length() == 2*n) {
            System.out.println(result);
            return;
        }

        if (openingCount > 0) {
            //result = result + "(";
            recur2(n, openingCount-1, closingCount, result + "(");
        }

        if (closingCount > openingCount) {
            //result = result + ")";
            recur2(n, openingCount, closingCount-1, result + ")");
        }
    }

    private static void recur(int n, int openRemaining, int closeRemaining, String result) {
        if (result.length() == 2*n) {
            System.out.println(result);
            return;
        }

        if (stillHaveOpenLeft(openRemaining)) {
            recur(n, openRemaining-1,closeRemaining,result+"(");
        }
        if (openLeftLessThanClose(openRemaining, closeRemaining)) {
            recur(n, openRemaining,closeRemaining-1,result+")");
        }
    }

    private static boolean openLeftLessThanClose(int openRemaining, int closeRemaining) {
        return openRemaining < closeRemaining;
    }

    private static boolean stillHaveOpenLeft(int openRemaining) {
        return openRemaining > 0;
    }
}
