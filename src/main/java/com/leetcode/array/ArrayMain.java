package com.leetcode.array;

import com.leetcode.array.easy.GoodPairs;
import com.leetcode.array.medium.RotateArray;

import java.util.Arrays;

public class ArrayMain {

    public static void main(String[] args) {
        //Arrays.stream(ShuffleArray.shuffle(new int[]{1,2,3,4,4,3,2,1}, 4)).forEach(System.out::println);
        //System.out.println(GoodPairs.numIdenticalPairs(new int[]{1,1,1,1}));
        RotateArray.rotate(new int[]{1,2,3,4,5,6}, 3);
    }
}
