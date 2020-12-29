package com.zhe.leetcode.easy;

/**
 * 896. Monotonic Array
 *
 * @author zhangzhe
 */
public class MonotonicArraySolution {

    public static void main(String[] args) {
        int[] A = {1, 1, 3};
        System.out.println(isMonotonic(A));
    }

    private static boolean isMonotonic(int[] A) {
        boolean increasing = true;
        boolean decreasing = true;
        for (int i = 0; i < A.length - 1; ++i) {
            if (A[i] > A[i + 1]) {
                increasing = false;
            }
            if (A[i] < A[i + 1]) {
                decreasing = false;
            }
            if(!increasing && !decreasing) {
                break;
            }
        }
        return increasing || decreasing;
    }

}
