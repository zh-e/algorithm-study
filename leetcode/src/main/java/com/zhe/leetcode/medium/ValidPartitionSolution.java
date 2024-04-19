package com.zhe.leetcode.medium;

/**
 * 2369. 检查数组是否存在有效划分
 * 给你一个下标从 0 开始的整数数组 nums ，你必须将数组划分为一个或多个 连续 子数组。
 *
 * 如果获得的这些子数组中每个都能满足下述条件 之一 ，则可以称其为数组的一种 有效 划分：
 *
 * 子数组 恰 由 2 个相等元素组成，例如，子数组 [2,2] 。
 * 子数组 恰 由 3 个相等元素组成，例如，子数组 [4,4,4] 。
 * 子数组 恰 由 3 个连续递增元素组成，并且相邻元素之间的差值为 1 。例如，子数组 [3,4,5] ，但是子数组 [1,3,5] 不符合要求。
 * 如果数组 至少 存在一种有效划分，返回 true ，否则，返回 false 。
 *
 *
 *
 * 示例 1：
 *
 * 输入：nums = [4,4,4,5,6]
 * 输出：true
 * 解释：数组可以划分成子数组 [4,4] 和 [4,5,6] 。
 * 这是一种有效划分，所以返回 true 。
 * 示例 2：
 *
 * 输入：nums = [1,1,1,2]
 * 输出：false
 * 解释：该数组不存在有效划分。
 *
 */
public class ValidPartitionSolution {

    public static void main(String[] args) {
        int[] nums = new int[]{1, 1, 1, 1, 2, 3, 4, 9};
        System.out.println(new ValidPartitionSolution().validPartition(nums));
    }

    public boolean validPartition(int[] nums) {
        int len = nums.length;
        if (len < 2) {
            return false;
        }
        return check(nums, 0, len);
    }

    public boolean check(int[] nums, int start, int len) {
        boolean res = false;
        if (start == len) {
            return true;
        }
        if (start + 1 < len) {
            res = (nums[start] == nums[start + 1] && check(nums, start + 2, len));
        }

        if (start + 2 < len) {
            res = res || (((nums[start] == nums[start + 1] && nums[start] == nums[start + 2])
                    || (nums[start] + 1 == nums[start + 1] && nums[start] + 2 == nums[start + 2]))
                    && check(nums, start + 3, len));
        }
        return res;
    }

}
