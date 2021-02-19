package com.leetcode.array.medium;

public class RotateArray {

    public static void rotate(int[] nums, int k) {
        if (k == nums.length || nums.length == 1 || k == 0)
            return;

        if (k > nums.length) {
            k = k - nums.length;
        }

        int gtemp = nums[0], in = 0, counter = nums.length;
        boolean start =true, processed = false;
        while(counter > 0) {
            if (!start && in == 0) {
                in++;gtemp=nums[in];
                //counter++;
            }
            if (processed && in == k +1) {
                in++;gtemp=nums[in];
            }
            if (in == k +1) {
                processed = true;
            }
            int newIndex = in + k;
            start=false;
            if (newIndex >= nums.length) {
                newIndex = newIndex - nums.length;
            }
            int localTemp = nums[newIndex];
            nums[newIndex] = gtemp;
            gtemp = localTemp;
            in = newIndex;
            counter--;
        }


        for (int i = 0; i < nums.length; i++) {
            System.out.println(i + " > " + nums[i]);
        }
    }
}
