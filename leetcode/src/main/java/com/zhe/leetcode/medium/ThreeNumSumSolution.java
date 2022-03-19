package com.zhe.leetcode.medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 15. 三数之和
 * 给你一个包含 n 个整数的数组 nums，判断 nums 中是否存在三个元素 a，b，c ，使得 a + b + c = 0 ？请你找出所有和为 0 且不重复的三元组。
 * <p>
 * 注意：答案中不可以包含重复的三元组。
 */
public class ThreeNumSumSolution {

    public static void main(String[] args) {
        int[] nums = new int[]{1, -1, -1, 0};

        System.out.println(new ThreeNumSumSolution().threeSum(nums));

    }

    public List<List<Integer>> threeSum(int[] nums) {

        if (nums.length == 0) {
            return new ArrayList<>();
        }

        Arrays.sort(nums);
        List<List<Integer>> res = new ArrayList<>();
        for (int i = 0, length = nums.length; i < length; i++) {
            if (i > 0 && nums[i] == nums[i - 1]) {
                continue;
            }
            int k = length - 1;
            for (int j = i + 1; j < length; j++) {
                if (j > i + 1 && nums[j] == nums[j - 1]) {
                    continue;
                }

                while (j < k && nums[j] + nums[k] + nums[i] != 0) {
                    k--;
                }

                if (j == k) {
                    break;
                }

                if (nums[j] + nums[k] + nums[i] == 0) {
                    List<Integer> line = new ArrayList<>();
                    line.add(nums[i]);
                    line.add(nums[j]);
                    line.add(nums[k]);
                    res.add(line);
                }
            }
        }
        return res;
    }

}
