package com.sorting;

import java.util.Arrays;

public class MergeSort {

    public static void main(String[] args) {
        int[] arr = {3, 5, 67, 2, 4,84,54,67,65156,7,61,684,616,546,468,1684,31,398,1,68,4,16,5468,465,51};
        solve(arr);
    }

    private static void solve(int[] arr) {
        int[] result = recur(arr, 0, arr.length - 1);
        Arrays.stream(result).forEach(item -> System.out.print(item + " "));
    }

    private static int[] recur(int[] arr, int start, int end) {
        if (start == end-1) {
            return arr[start] < arr[end] ? new int[]{arr[start], arr[end]} : new int[]{arr[end], arr[start]};
        }
        if (start == end) {
            return new int[]{arr[start]};
        }

        int pivotIndex = (start+end)/2;
        //System.out.println(start + " " + end + " " + pivotIndex);
        int[] preArr = recur(arr, start, pivotIndex-1);
        int[] postArr = recur(arr, pivotIndex, end);
        return merge(preArr, postArr);
    }

    private static int[] merge(int[] preArr, int[] postArr) {
        int i =0, j=0, finalIn=0;
        int[] result = new int[preArr.length + postArr.length];
        while(i < preArr.length || j < postArr.length) {
            if (i == preArr.length) {
                result[finalIn++] = postArr[j++];
                continue;
            }
            if (j == postArr.length) {
                result[finalIn++] = preArr[i++];
                continue;
            }
            if (preArr[i] < postArr[j]) {
                result[finalIn] = preArr[i];
                i++;
            } else {
                result[finalIn] = postArr[j];
                j++;
            }
            finalIn++;
        }
        return result;
    }

}
