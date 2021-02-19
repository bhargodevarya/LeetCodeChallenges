package com.backtracking;

import java.util.*;

public class Powerset {

    public static void main(String[] args) {

        HashMap<Integer, Integer> map = new LinkedHashMap<>();
        map.put(5,2);
        map.put(6,2);
        map.put(7,3);
        map.put(1,8);
        map.put(9,3);
        map.values().stream().forEach(entry -> System.out.println(entry));

        //solve(new int[]{1,2,3});
    }

    private static void solve(int[] nums) {
        ArrayList<List<Integer>> result = new ArrayList<>();
        recur(0, nums,result, new ArrayList<Integer>());
        result.stream().forEach(item -> {
            System.out.println(item);
        });
    }

    private static void recur(int in, int[] arr, ArrayList<List<Integer>> result, ArrayList<Integer> current) {
        if (in == arr.length) {
            result.add(new ArrayList<>(current));
            return;
        }
        int take = arr[in];
        current.add(take);
        recur(in+1, arr, result, current);
        current.remove(current.size()-1);
        recur(in+1, arr, result, current);
    }
}
