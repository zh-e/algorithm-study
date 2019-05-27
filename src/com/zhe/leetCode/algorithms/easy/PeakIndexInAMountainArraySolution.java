package com.zhe.leetCode.algorithms.easy;

/**
 * 852. Peak Index in a Mountain Array
 *
 * @author zhangzhe
 */
public class PeakIndexInAMountainArraySolution {

    public static void main(String[] args) {
        int[] A = {3,4,5,1};
        System.out.println(peakIndexInMountainArray(A));
    }

    private static int peakIndexInMountainArray(int[] A) {
        int tmp = 0;
        int res = 0;
        for(int i = 0, len = A.length; i < len; i++) {
            if(tmp < A[i]) {
                tmp = A[i];
                res = i;
            }
        }
        return res;
    }
}
