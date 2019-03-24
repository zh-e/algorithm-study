package com.zhe.leetCode.algorithms.hard;

import sun.security.util.Length;

import java.util.Arrays;

/**
 * 有两个排序的数组nums1和nums2分别为m和n。 找到两个排序数组的中位数
 *
 * @author zhangzhe
 */
public class MedianOfTwoSortedArraysSolution {

    public static void main(String[] args) {
        int[] nums1 = {3};
        int[] nums2 = {-2, -1};

        System.out.println(findMedianSortedArrays(nums1, nums2));

        int[] nums3 = {1, 3};
        int[] nums4 = {2};
        System.out.println(findMedianSortedArrays(nums3, nums4));

        int[] nums5 = {};
        int[] nums6 = {1};
        System.out.println(findMedianSortedArrays(nums5, nums6));

    }

    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int m = nums1.length;
        int n = nums2.length;
        if (m > n) {
            int[] temp = nums1;
            nums1 = nums2;
            nums2 = temp;
            int tmp = m;
            m = n;
            n = tmp;
        }
        int iMin = 0, iMax = m, halfLen = (m + n + 1) / 2;
        while (iMin <= iMax) {
            int i = (iMin + iMax) / 2;
            int j = halfLen - i;
            if (i < iMax && nums2[j - 1] > nums1[i]) {
                iMin = i + 1;
            } else if (i > iMin && nums1[i - 1] > nums2[j]) {
                iMax = i - 1;
            } else {
                int maxLeft = 0;
                if (i == 0) {
                    maxLeft = nums2[j - 1];
                } else if (j == 0) {
                    maxLeft = nums1[i - 1];
                } else {
                    maxLeft = Math.max(nums1[i - 1], nums2[j - 1]);
                }
                if ((m + n) % 2 == 1) {
                    return maxLeft;
                }

                int minRight = 0;
                if (i == m) {
                    minRight = nums2[j];
                } else if (j == n) {
                    minRight = nums1[i];
                } else {
                    minRight = Math.min(nums2[j], nums1[i]);
                }

                return (maxLeft + minRight) / 2.0;
            }
        }
        return 0.0;
    }

}
