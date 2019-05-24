package com.zhe.leetCode.algorithms.easy;

/**
 * 905 Sort Array By Parity
 *
 * @author zhangzhe
 */
public class SortArrayByParitySolution {

    public static void main(String[] args) {
        int[] a = sortArrayByParity(new int[]{1, 4, 2, 2});

        for (int i : a) {
            System.out.print(i + "    ");
        }
    }

    private static int[] sortArrayByParity(int[] A) {
        int i = 0, j = A.length - 1;
        while (i < j) {
            if (A[i] % 2 > A[j] % 2) {
                int tmp = A[i];
                A[i] = A[j];
                A[j] = tmp;
            }
            if (A[i] % 2 == 0) {
                i++;
            }
            if (A[j] % 2 == 1) {
                j--;
            }
        }
        return A;
    }

}
