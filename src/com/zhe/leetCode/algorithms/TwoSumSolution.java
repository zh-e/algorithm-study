package com.zhe.leetCode.algorithms;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * 给定一个整数数组和一个目标值，找出数组中和为目标值的两个数。
 * 你可以假设每个输入只对应一种答案，且同样的元素不能被重复利用。
 * 示例:
 *      给定 nums = [2, 7, 11, 15], target = 9
 *      因为 nums[0] + nums[1] = 2 + 7 = 9
 *      所以返回 [0, 1]
 */
public class TwoSumSolution {

    public int[] twoSum(int[] nums, int target) {

        Map<Integer, Integer> indexMap = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int n = target - nums[i];
            Integer num = indexMap.get(n);
            if(num != null) {
                return new int[] {num, i};
            }
            indexMap.put(nums[i], i);
        }

        return null;
    }

    public static void main(String[] args) {
        int[] nums = {2, 7, 11, 15};
        int target = 9;
        System.out.println(Arrays.toString(new TwoSumSolution().twoSum(nums, target)));
    }

}
