package com.zhe.leetCode.algorithms.easy;

import com.zhe.leetCode.algorithms.base.ArrayUtils;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

/**
 * 496. Next Greater Element I
 *
 * @author zhangzhe
 */
public class NextGreaterElementISolution {

    public static void main(String[] args) {
        int[] nums1 = {2, 4}, nums2 = {5, 1, 2, 3, 4, 6};
        ArrayUtils.printArry(nextGreaterElement(nums1, nums2));
    }

    private static int[] nextGreaterElement(int[] nums1, int[] nums2) {
        Map<Integer, Integer> map = new HashMap<>();
        Stack<Integer> stack = new Stack<>();
        for (int num : nums2) {
            while (!stack.isEmpty() && stack.peek() < num) {
                map.put(stack.pop(), num);
            }
            stack.push(num);
        }
        for (int i = 0; i < nums1.length; i++) {
            nums1[i] = map.getOrDefault(nums1[i], -1);
        }
        return nums1;
    }

}
