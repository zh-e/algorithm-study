package com.zhe.leetCode.algorithms.easy;

import com.zhe.leetCode.algorithms.base.ArrayUtils;

import java.util.HashSet;
import java.util.Set;

/**
 * 349. Intersection of Two Arrays
 *
 * @author zhangzhe
 */
public class IntersectionOfTwoArraysSolution {

    public static void main(String[] args) {
        int[] nums1 = {4, 9, 5}, nums2 = {9, 4, 9, 8, 4};
        ArrayUtils.printArry(intersection(nums1, nums2));
    }

        private static int[] intersection(int[] nums1, int[] nums2){
            Set<Integer> numSet = new HashSet<>();
            for (int i : nums1) {
                numSet.add(i);
            }

            Set<Integer> ansSet = new HashSet<>();
            for (int i : nums2) {
                if (numSet.contains(i)) {
                    ansSet.add(i);
                }
            }

            int[] ans = new int[ansSet.size()];
            int index = 0;
            for (int i : ansSet) {
                ans[index++] = i;
            }
            return ans;
        }
    }
