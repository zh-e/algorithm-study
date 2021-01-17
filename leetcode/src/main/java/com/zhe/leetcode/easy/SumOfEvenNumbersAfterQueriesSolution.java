package com.zhe.leetcode.easy;

import com.zhe.leetcode.base.ArrayUtils;

/**
 * 985. Sum of Even Numbers After Queries
 *
 * @author zhangzhe
 */
public class SumOfEvenNumbersAfterQueriesSolution {

    public static void main(String[] args) {
        int[] A = {1, 2, 3, 4};
        int[][] queries = {{1, 0}, {-3, 1}, {-4, 0}, {2, 3}};
        ArrayUtils.printArry(sumEvenAfterQueries(A, queries));
    }

    private static int[] sumEvenAfterQueries(int[] A, int[][] queries) {
        int evenSum = 0;
        for (int i : A) {
            if (i % 2 == 0) {
                evenSum += i;
            }
        }
        int[] res = new int[A.length];
        for (int i = 0, len = queries.length; i < len; i++) {
            int index = queries[i][1];
            int num = queries[i][0];
            if (A[index] % 2 == 0) {
                evenSum -= A[index];
            }
            A[index] += num;
            if (A[index] % 2 == 0) {
                evenSum += A[index];
            }
            res[i] = evenSum;
        }
        return res;
    }

}
