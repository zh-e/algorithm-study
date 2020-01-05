package com.zhe.leetcode.algorithms.easy;

/**
 * 1009. Complement of Base 10 Integer
 *
 * @author zhangzhe
 */
public class ComplementOfBase10IntegerSolution {

    public static void main(String[] args) {
        int N = 5;
        System.out.println(bitwiseComplement(N));
    }

    private static int bitwiseComplement(int N) {
        if(N == 0) {
            return 1;
        }
        return ~N + (Integer.highestOneBit(N) << 1);
    }

}
