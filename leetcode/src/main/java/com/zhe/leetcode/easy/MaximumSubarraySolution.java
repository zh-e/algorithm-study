package com.zhe.leetcode.easy;

/**
 * 53. Maximum Subarray
 * <p>
 * 给你一个整数数组 nums ，请你找出一个具有最大和的连续子数组（子数组最少包含一个元素），返回其最大和。
 */
public class MaximumSubarraySolution {

    public static void main(String[] args) {
        int[] nums = new int[]{-2, 1, -3, 4, -1, 2, 1, -5, 4};
        System.out.println(new MaximumSubarraySolution().maxSubArray(nums));
    }

    public int maxSubArray(int[] nums) {
        int pre = 0, maxAns = nums[0];
        for (int x : nums) {
            pre = Math.max(pre + x, x);
            maxAns = Math.max(maxAns, pre);
        }
        return maxAns;
    }

    private int maxSubArraySum(int[] nums, int left, int right) {
        if (left == right) {
            return nums[left];
        }

        int mid = left + (right - left) / 2;
        return max3(maxSubArraySum(nums, left, mid), maxSubArraySum(nums, mid + 1, right), maxCrossingSum(nums, left, mid, right));
    }

    private int maxCrossingSum(int[] nums, int left, int mid, int right) {
        int sum = 0;
        int leftSum = Integer.MIN_VALUE;

        for (int i = mid; i >= left; i--) {
            sum += nums[i];
            if (sum > leftSum) {
                leftSum = sum;
            }
        }

        sum = 0;
        int rightSum = Integer.MIN_VALUE;
        for (int i = mid + 1; i <= right; i++) {
            sum += nums[i];
            if (sum > rightSum) {
                rightSum = sum;
            }
        }

        return leftSum + rightSum;

    }

    private int max3(int num1, int num2, int num3) {
        return Math.max(num1, Math.max(num2, num3));
    }

}
