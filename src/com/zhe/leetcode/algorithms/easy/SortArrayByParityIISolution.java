package com.zhe.leetcode.algorithms.easy;

import com.zhe.leetcode.algorithms.base.ArrayUtils;

/**
 * 922. Sort Array By Parity II
 *
 * @author zhangzhe
 */
public class SortArrayByParityIISolution {

    public static void main(String[] args) {
        int[] A = {4,2,5,7};
        ArrayUtils.printArry(sortArrayByParityII(A));
    }

    private static int[] sortArrayByParityII(int[] A) {
        int[] res = new int[A.length];
        int odd = 0;
        int even = 1;
        for(int i : A) {
            if(i % 2 == 0 ){
                res[odd] = i;
                odd += 2;
            } else {
                res[even] = i;
                even += 2;
            }
        }
        return res;
    }

}
