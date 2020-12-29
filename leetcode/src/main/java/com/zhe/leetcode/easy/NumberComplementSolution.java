package com.zhe.leetcode.easy;

/**
 * 476. Number Complement
 *
 * @author zhangzhe
 */
public class NumberComplementSolution {

    public static void main(String[] args) {
        int num = 5;
        System.out.println(findComplement(num));
    }

    private static int findComplement(int num) {
        return ~num + (Integer.highestOneBit(num) << 1);
    }

}
