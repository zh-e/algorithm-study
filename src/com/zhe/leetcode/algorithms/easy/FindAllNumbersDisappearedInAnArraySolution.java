package com.zhe.leetcode.algorithms.easy;

import com.zhe.leetcode.algorithms.base.ArrayUtils;

import java.util.ArrayList;
import java.util.List;

/**
 * 448. Find All Numbers Disappeared in an Array
 *
 * @author zhe
 */
public class FindAllNumbersDisappearedInAnArraySolution {

    public static void main(String[] args) {
        int[] nums = new int[]{4, 3, 2, 7, 8, 2, 3, 1};
        System.out.println(findDisappearedNumbers(nums));
    }

    public static List<Integer> findDisappearedNumbers(int[] nums) {
        int[] list = new int[nums.length];
        for (int num : nums) {
            list[num - 1] = 1;
        }
        List<Integer> res = new ArrayList<>();
        for (int i = 0, len = list.length; i < len; i++) {
            if (list[i] == 0) {
                res.add(i + 1);
            }
        }
        return res;
    }

}
