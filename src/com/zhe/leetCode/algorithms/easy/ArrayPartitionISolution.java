package com.zhe.leetCode.algorithms.easy;

import java.util.Arrays;

/**
 * 561. Array Partition I
 *
 * @author zhangzhe
 */
public class ArrayPartitionISolution {

    public static void main(String[] args) {
        int[] nums = {1,4,3,2};
        System.out.println(arrayPairSum(nums));
    }

    private static int arrayPairSum(int[] nums) {
        Arrays.sort(nums);
        int res = 0;
        for (int i = 0, len = nums.length; i < len; i += 2) {
            res += nums[i];
        }
        return res;
    }

}
