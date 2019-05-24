package com.zhe.leetCode.algorithms.easy;

import com.zhe.leetCode.algorithms.base.Arrays;

import java.util.logging.Level;

/**
 * 832. Flipping an Image
 *
 * @author zhangzhe
 */
public class FlippingAnImageSolution {

    public static void main(String[] args) {
        int[][] A = {{1,1,0},{1,0,1},{0,0,0}};
        //int[][] A = {{1, 1, 0, 0}, {1, 0, 0, 1}, {0, 1, 1, 1}, {1, 0, 1, 0}};
        int[][] a = flipAndInvertImage(A);
        Arrays.printArry(a);

    }

    private static int[][] flipAndInvertImage(int[][] A) {

        for (int i = 0, len = A.length; i < len; i++) {
            int n = A[i].length;
            int size = n % 2 == 0 ? n / 2 - 1 : n / 2;
            for (int j = 0; j <= size; j++) {
                int k = n - 1 - j;
                int tmp = A[i][j];
                A[i][j] = A[i][k] ^ 1;
                A[i][k] = tmp ^ 1;
            }
        }
        return A;
    }
}
