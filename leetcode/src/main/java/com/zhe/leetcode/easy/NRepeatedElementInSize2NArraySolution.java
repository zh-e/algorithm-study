package com.zhe.leetcode.easy;

import java.util.HashSet;
import java.util.Set;

/**
 * 961. N-Repeated Element in Size 2N Array
 *
 * @author zhangzhe
 */
public class NRepeatedElementInSize2NArraySolution {

    public static void main(String[] args) {
        int[] A = {2,1,2,5,3,2};
        System.out.println(repeatedNTimes(A));
    }

    private static int repeatedNTimes(int[] A) {
        Set<Integer> set = new HashSet<>();
        for (int i : A) {
            if (set.contains(i)) {
                return i;
            }
            set.add(i);
        }
        return 0;
    }

}
