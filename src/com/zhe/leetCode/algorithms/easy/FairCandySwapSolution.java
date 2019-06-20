package com.zhe.leetCode.algorithms.easy;

import com.zhe.leetCode.algorithms.base.ArrayUtils;

import java.util.HashSet;
import java.util.Set;

/**
 * 888. Fair Candy Swap
 *
 * @author zhangzhe
 */
public class FairCandySwapSolution {

    public static void main(String[] args) {
        int[] A = {1,2,5};
        int[] B = {2,4};
        ArrayUtils.printArry(fairCandySwap(A, B));
    }

    private static int[] fairCandySwap(int[] A, int[] B) {
        int suma = 0, sumb = 0;
        Set<Integer> setb = new HashSet<>();

        for (int i : A) {
            suma += i;
        }
        for (int i : B) {
            sumb += i;
            setb.add(i);
        }
        int num = (sumb - suma) / 2;
        for (int x : A) {
            if (setb.contains(x + num)) {
                return new int[]{x, x + num};
            }
        }
        return null;
    }

}
