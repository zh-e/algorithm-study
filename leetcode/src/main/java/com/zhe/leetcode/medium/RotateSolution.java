package com.zhe.leetcode.medium;

import com.zhe.leetcode.easy.RotatedDigitsSolution;

import java.util.Arrays;
import java.util.concurrent.CompletableFuture;

/**
 * 189. 轮转数组
 * 给定一个整数数组 nums，将数组中的元素向右轮转 k 个位置，其中 k 是非负数。
 * <p>
 * <p>
 * 示例 1:
 * <p>
 * 输入: nums = [1,2,3,4,5,6,7], k = 3
 * 输出: [5,6,7,1,2,3,4]
 * 解释:
 * 向右轮转 1 步: [7,1,2,3,4,5,6]
 * 向右轮转 2 步: [6,7,1,2,3,4,5]
 * 向右轮转 3 步: [5,6,7,1,2,3,4]
 * 示例 2:
 * <p>
 * 输入：nums = [-1,-100,3,99], k = 2
 * 输出：[3,99,-1,-100]
 * 解释:
 * 向右轮转 1 步: [99,-1,-100,3]
 * 向右轮转 2 步: [3,99,-1,-100]
 */
public class RotateSolution {

    public static void main(String[] args) {
        int[] nums = new int[]{-1,-100,3,99};
//        5,6,7,1,2,3,4
        int k = 2;

        new RotateSolution().rotate(nums, k);

        System.out.println(Arrays.toString(nums));
    }

    public void rotate(int[] nums, int k) {;
        int index = 0;
        int next = nums[index];
        int step = 0;
        while (step < nums.length) {
            int nextIndex = (index + k) % nums.length;
            int temp = nums[nextIndex];
            nums[nextIndex] = next;
            next = temp;
            index = nextIndex;
            step++;
        }

    }



}
