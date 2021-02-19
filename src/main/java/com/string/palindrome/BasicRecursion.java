package com.string.palindrome;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class BasicRecursion {

    private static Set<String> result = new HashSet<>();
    private static Set<Node> set = new HashSet<>();

    public static void main(String[] args) {
        solve("abcdccba");
    }

    public static void solve(String str) {
        recur(str, 0, str.length() - 1);
        result.forEach(System.out::println);
        //set.forEach(System.out::println);
    }

    private static boolean recur(String str, int start, int end) {
        System.out.println("start " + start + " end " + end);
        if (start > end) {
            return false;
        }
        if (end == start) {
            result.add(String.valueOf(str.charAt(start)));
            set.add(new Node(start,end));
            return true;
        }

        boolean conditionCheckResult = str.charAt(start) == str.charAt(end);
        if (start + 1 == end) {
            if (conditionCheckResult) {
                result.add(str.substring(start, end + 1));
                set.add(new Node(start,end));

                result.add(str.substring(start, end));
                set.add(new Node(start,start));
                set.add(new Node(end,end));
                return true;
            }

            //if (!set.contains(new Node(start, start)))
                recur(str, start, start);
            //if (!set.contains(new Node(end,end)))
                recur(str, end, end);
            return false;
        }

        if (conditionCheckResult) {
            if (!set.contains(new Node(start+1, end -1))) {
                if (recur(str, start + 1, end - 1)) {
                    set.add(new Node(start,end));
                    result.add(str.substring(start, end + 1));
                    return true;
                }
            } else {
                set.add(new Node(start,end));
                result.add(str.substring(start, end + 1));
            }
        }

        boolean left = false, right = false;
        if (!set.contains(new Node(start+1, end))) {
            left = recur(str, start + 1, end);
        }
        if (!set.contains(new Node(start, end-1))) {
            right = recur(str, start, end - 1);
        }
        return left || right;
    }

    static class Node {
        int start, end;

        public Node(int start, int end) {
            this.start = start;
            this.end = end;
        }

        public int getStart() {
            return start;
        }

        public int getEnd() {
            return end;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Node node = (Node) o;
            return start == node.start &&
                    end == node.end;
        }

        @Override
        public int hashCode() {
            return Objects.hash(start, end);
        }

        @Override
        public String toString() {
            return "Node{start=" + start + ", end=" + end + '}';
        }
    }
}
