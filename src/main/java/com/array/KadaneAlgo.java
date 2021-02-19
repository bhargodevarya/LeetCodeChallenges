package com.array;

public class KadaneAlgo {

    public static void main(String[] args) {
        int[] arr = {-2, -3, -4, -2, 3};
        maxSubArraySum(arr, arr.length);
    }

    private static void maxSubArraySum(int[] arr, int size) {
        int max_so_far = arr[0], max_ending_here = 0, start = 0, end = 0, s = 0;

        for (int i = 1; i < size; i++) {
            max_ending_here =  max_ending_here + arr[i];
            if (max_so_far < max_ending_here) {
                max_so_far = max_ending_here;
                start = s;
                end = i;
            }
            if (max_ending_here < 0) {
                max_ending_here = 0;
                s = i + 1;
            }
        }
        System.out.println("Maximum contiguous sum is " + max_so_far);
        System.out.println("Starting index " + start);
        System.out.println("Ending index " + end);
    }

}
