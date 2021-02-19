package com.sorting;

import java.util.Arrays;

public class SelectionSort {

    public static void main(String[] args) {
        sort(new int[]{3,1,4,2});
    }

    private static void sort(int[] arr) {
        recur(arr, 0);
        Arrays.stream(arr).forEach(System.out::println);
    }

    private static void recur(int[] arr, int start) {
        for (int i = start; i <= arr.length -1; i++) {
            int minItemIndex = selectMinItemIndex(arr, i, arr.length);
            swap(arr, i, minItemIndex);
        }
        /*if (start == arr.length-1)
            return;
        int minItemIndex = selectMinItemIndex(arr, start, arr.length);
        swap(arr, start, minItemIndex);
        recur(arr, start+1);*/
    }

    private static void swap(int[] arr, int in, int minItemIndex) {
        int temp = arr[in];
        arr[in] = arr[minItemIndex];
        arr[minItemIndex] = temp;
    }

    private static int selectMinItemIndex(int[] arr, int start, int end) {
        int min = arr[start], minIndex = start;
        for (int i = start+1; i < end; i++) {
            if (arr[i] < min) {
                minIndex = i;
                min = arr[i];
            }
        }
        return minIndex;
    }
}
