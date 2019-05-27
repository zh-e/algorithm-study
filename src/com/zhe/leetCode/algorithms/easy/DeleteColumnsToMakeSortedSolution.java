package com.zhe.leetCode.algorithms.easy;

/**
 * 944. Delete Columns to Make Sorted
 *
 * @author zhangzhe
 */
public class DeleteColumnsToMakeSortedSolution {

    public static void main(String[] args) {
        String[] A = {"zyx","wvu","tsr"};
        System.out.println(minDeletionSize(A));
    }

    private static int minDeletionSize(String[] A) {
        int res = 0;
        for (int i = 0; i < A[0].length(); ++i) {
            for (int j = 0; j < A.length - 1; ++j) {
                if (A[j].charAt(i) > A[j + 1].charAt(i)) {
                    res++;
                    break;
                }
            }
        }
        return res;
    }

}
