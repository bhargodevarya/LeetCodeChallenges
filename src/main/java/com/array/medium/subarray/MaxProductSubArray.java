package com.array.medium.subarray;

/**
 * 
 * https://leetcode.com/problems/maximum-product-subarray/
 * 
 * [2,3,-2,4]
   [-2,0,-1]
   [-3,-1,-1]
   [2,-1,1,1]
 */
public class MaxProductSubArray {

    public static void main(String[] args) {
        int result = solve(new int[]{0,0,0,0,-20,0,0,0,0});
        System.out.println(result);
    }

    private static int solve(int[] nums) {
        if (nums.length == 1)
            return nums[0];
        int max_so_far = nums[0];int min_so_far = nums[0];
        int result = nums[0];
        for (int i = 1; i <= nums.length-1; i++) {

            if (nums[i] < 0) {
                int temp = max_so_far;
                max_so_far = min_so_far;
                min_so_far = temp;
            }
            max_so_far = Math.max(nums[i], max_so_far * nums[i]);
            min_so_far = Math.min(nums[i], min_so_far * nums[i]);

            result = Math.max(result, max_so_far);
        }

        return result;
    }
    
}
