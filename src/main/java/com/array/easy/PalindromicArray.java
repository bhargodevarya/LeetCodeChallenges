package com.array.easy;

public class PalindromicArray {    

    public static void main(String[] args) {
        boolean result = solve(new int[]{1,2,5,2,2,1});
        System.out.println(result);    
    }

    private static boolean solve(int[] nums) {
        int i = 0, j = nums.length-1;
        while(i <= j && nums[i] == nums[j]) {
            i++;j--;
        }
        return i >= j;
    }

}
