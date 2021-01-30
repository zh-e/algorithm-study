package com.zhe.leetcode.easy;

/**
 * 908. Smallest Range I
 *
 * @author zhangzhe
 */
public class SmallestRangeISolution {

    public static void main(String[] args) {
        int[] A = {0, 10};
        int K = 2;
        System.out.println(smallestRangeI(A, K));
    }

    private static int smallestRangeI(int[] A, int K) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for (int i : A) {
            max = Math.max(max, i);
            min = Math.min(min, i);
        }
        return max - K > min + K ? max - min - 2 * K : 0;
    }

}
