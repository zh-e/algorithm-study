package com.zhe.leetCode.algorithms.easy;

/**
 * 766. Toeplitz Matrix
 *
 * @author zhangzhe
 */
public class ToeplitzMatrixSolution {

    public static void main(String[] args) {
//        int[][] matrix = new int[][]{
//                {1, 2, 3, 4},
//                {5, 1, 2, 3},
//                {9, 5, 1, 2}
//        };

//        int[][] matrix = new int[][]{
//                {65, 98, 57},
//        };

        int[][] matrix = new int[][]{
                {0, 33, 98},
                {34, 22, 33}
        };

        System.out.println(isToeplitzMatrix(matrix));
    }

    private static boolean isToeplitzMatrix(int[][] matrix) {
        int r = matrix.length;
        int c = matrix[0].length;
        Integer[] flag = new Integer[r + c - 1];

        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                int k = j + r - 1 - i;
                if (flag[k] == null) {
                    flag[k] = matrix[i][j];
                } else if (flag[k] != matrix[i][j]) {
                    return false;
                }
            }
        }
        return true;
    }

}
