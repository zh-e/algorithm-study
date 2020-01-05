package com.zhe.leetcode.algorithms.easy;

import com.zhe.leetcode.algorithms.base.ArrayUtils;

/**
 * 566. Reshape the Matrix
 *
 * @author zhangzhe
 */
public class ReshapeTheMatrixSolution {

    public static void main(String[] args) {
        int[][] nums = {
                {1, 2},
                {3, 4}
        };
        int r = 1, c = 4;
        ArrayUtils.printArry(matrixReshape(nums, r, c));
    }

    private static int[][] matrixReshape(int[][] nums, int r, int c) {
        int rLen = nums.length;
        int cLen = nums[0].length;
        if (r >= rLen && c >= cLen) {
            return nums;
        }

        int[][] ans = new int[r][c];
        int nr = 0, nc = 0;
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                if (nc >= cLen) {
                    nr++;
                    nc = 0;
                }
                ans[i][j] = nums[nr][nc];
                nc ++;
            }
        }
        return ans;
    }

}
