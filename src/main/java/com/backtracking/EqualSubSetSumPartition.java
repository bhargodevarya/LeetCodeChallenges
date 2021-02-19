package com.backtracking;

import java.util.ArrayList;
import java.util.Arrays;

public class EqualSubSetSumPartition {

    public static void main(String[] args) {
        solve(new int[]{2,4,11,3,5});
    }

    private static void solve(int[] arr) {
        int sum = Arrays.stream(arr).sum();
        System.out.println(recur(0, arr, new ArrayList<Integer>(), 0, sum/2, new boolean[arr.length]));
    }

    private static boolean recur(int in, int[] arr, ArrayList<Integer> bucket, int currentBucketSum, int bucketTargetSum, boolean[] visited) {
        System.out.println("called");
        if (currentBucketSum == bucketTargetSum) {
            return true;
        }
        for (int i = in; i < arr.length; i++) {
            if (!visited[i]) {
                visited[i] = true;
                bucket.add(arr[i]);
                boolean recur = recur(in + 1, arr, bucket, currentBucketSum + arr[i], bucketTargetSum, visited);
                if (recur) {
                    return true;
                }
                visited[i] = false;
                bucket.remove(bucket.size()-1);
            }
        }
        return false;
    }
}
