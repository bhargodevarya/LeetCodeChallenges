package com.sorting;

import java.util.Arrays;

public class InsertionSort {

    public static void main(String[] args) {
        solve(new int[]{5,1,3,7,5,8,3});
    }

    private static void solve(int[] arr) {
        for (int i =1; i < arr.length; i++) {
            for (int j=i-1;j>=0; j--){
                if (compare(arr, j+1, j)) {
                    swap(arr, j+1, j);
                } else {
                    break;
                }
            }
        }
        Arrays.stream(arr).forEach(System.out::println);
    }

    private static boolean compare(int[] arr, int i, int j) {
        return arr[i] < arr[j];
    }

    private static void swap(int[] arr, int in, int j) {
        int temp = arr[in];
        arr[in] = arr[j];
        arr[j] = temp;
    }
}
