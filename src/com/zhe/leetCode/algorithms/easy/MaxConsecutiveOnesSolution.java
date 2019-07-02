package com.zhe.leetCode.algorithms.easy;

/**
 * 485. Max Consecutive Ones
 *
 * @author zhangzhe
 */
public class MaxConsecutiveOnesSolution {

    public static void main(String[] args) {
        int[] nums = {1};
        System.out.println(findMaxConsecutiveOnes(nums));
    }

    private static int findMaxConsecutiveOnes(int[] nums) {
        int ans = 0;
        int flag = 0;
        for (int i : nums) {
            if (i == 1) {
                flag++;
            } else {
                flag = 0;
            }
            ans = Math.max(ans, flag);
        }
        return ans;
    }

}
