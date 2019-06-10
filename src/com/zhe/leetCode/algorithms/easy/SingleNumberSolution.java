package com.zhe.leetCode.algorithms.easy;

/**
 * 136. Single Number
 *
 * @author zhangzhe
 */
public class SingleNumberSolution {

    public static void main(String[] args) {
        int[] nums = {4, 1, 2, 1, 2, 0, 0};
        System.out.println(singleNumber(nums));
    }

    private static int singleNumber(int[] nums) {
        int ans = 0;
        for (int i : nums) {
            ans = ans ^ i;
        }
        return ans;
    }

}
