package com.zhe.leetcode.algorithms.easy;

import java.util.Arrays;

/**
 * 976. Largest Perimeter Triangle
 *
 * @author zhangzhe
 */
public class LargestPerimeterTriangleSolution {

    public static void main(String[] args) {
        int[] A = {3,2,3,4};
        System.out.println(largestPerimeter(A));
    }

    private static int largestPerimeter(int[] A) {
        Arrays.sort(A);
        for (int i = A.length - 3; i >= 0; i--) {
            if (A[i] + A[i + 1] > A[i + 2]) {
                return A[i] + A[i + 1] + A[i + 2];
            }
        }
        return 0;
    }

}
