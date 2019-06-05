package com.zhe.leetCode.algorithms.easy;

import com.zhe.leetCode.algorithms.base.ArrayUtils;

/**
 * 867. Transpose Matrix
 *
 * @author zhangzhe
 */
public class TransposeMatrixSolution {

    public static void main(String[] args) {
        int[][] A = {{1,2,3},{4,5,6},{7,8,9}};
        ArrayUtils.printArry(transpose(A));
    }

    private static int[][] transpose(int[][] A) {
        int rLen = A.length;
        int cLen = A[0].length;
        int[][] res = new int[cLen][rLen];
        for(int i = 0; i < rLen; i++) {
            for(int j = 0; j < cLen;j++) {
                res[j][i] = A[i][j];
            }
        }
        return res;
    }

}
