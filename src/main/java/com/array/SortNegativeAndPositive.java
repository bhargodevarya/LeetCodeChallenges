package com.array;

public class SortNegativeAndPositive {

    public static void main(String[] args) {
        int[] arr = {-1,-2,3,4,8,-6,7,5,-7,6,-4};
        solve(arr,0, arr.length-1);
        for (int item : arr) {
            System.out.println(item);
        }
    }

    private static void solve(int[] arr, int start, int end) {
        if (start > end) {
            return;
        }
        int i = start, j = end;
        while (arr[i] <0 && i < j) {
            i++;
        }

        while (arr[j] > 0 && j > i) {
            j--;
        }

        if (i < j) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }
        solve(arr, i+1, j -1);
    }
}
