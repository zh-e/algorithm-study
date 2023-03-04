package com.zhe.leetcode.easy;

import com.zhe.leetcode.base.ArrayUtils;

/**
 * 1480. Running Sum of 1d Array
 */
public class RunningSumOf1dArraySolution {

    public static void main(String[] args) {
        int[] nums = new int[]{1, 2, 3, 4};
        ArrayUtils.printArry(runningSum(nums));
    }

    public static int[] runningSum(int[] nums) {
        for (int i = 1, n = nums.length; i < n; i++) {
            nums[i] = nums[i] + nums[i - 1];
        }
        return nums;
    }

}
