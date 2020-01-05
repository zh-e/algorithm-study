package com.zhe.leetcode.algorithms.easy;

import com.zhe.leetcode.algorithms.base.ArrayUtils;

/**
 * 1089. Duplicate Zeros
 * @author zhangzhe
 */
public class DuplicateZerosSolution {

    public static void main(String[] args) {
        int[] arr = {0,0,0,0,0,0,0};
        duplicateZeros(arr);
        ArrayUtils.printArry(arr);
    }

    private static void duplicateZeros(int[] arr) {
        int[] ans  = new int[arr.length];
        for(int i = 0, j = 0, len = arr.length; i < len && j < len; j++, i++) {
            ans[j] = arr[i];
            if(arr[i] == 0 && ++j < len) {
                ans[j] = 0;
            }
        }
        for(int i = 0, len = arr.length; i < len; i++) {
            arr[i] = ans[i];
        }
    }

}
