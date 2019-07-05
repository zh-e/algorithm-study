package com.zhe.leetCode.algorithms.easy;

import com.zhe.leetCode.algorithms.base.ArrayUtils;

/**
 * 1122. Relative Sort Array
 *
 * @author zhangzhe
 */
public class RelativeSortArraySolution {

    public static void main(String[] args) {
        int[] arr1 = {2, 3, 1, 3, 2, 4, 6, 7, 9, 2, 19}, arr2 = {2, 1, 4, 3, 9, 6};
        ArrayUtils.printArry(relativeSortArray(arr1, arr2));
    }

    private static int[] relativeSortArray(int[] arr1, int[] arr2) {
        int[] cnt = new int[1001], ans = new int[arr1.length];
        for (int i : arr1) {
            ++cnt[i];
        }

        int k = 0;
        for (int i : arr2) {
            while (cnt[i]-- > 0) {
                ans[k++] = i;
            }
        }

        for (int i = 0; i < 1001; ++i) {
            while (cnt[i]-- > 0) {
                ans[k++] = i;
            }
        }
        return ans;
    }

}
