package com.zhe.leetcode.algorithms.easy;

/**
 * @author zhangzhe
 * Given a 32-bit signed integer, reverse digits of an integer.
 */
public class ReverseIntegerSolution {


    public static void main(String[] args) {
        System.out.println(reverse(1534236469));
    }

    private static int reverse(int x) {
        if (x > -10 && x < 10) {
            return x;
        }

        int result = 0;
        while (x != 0) {
            int n = x % 10;
            if (result > Integer.MAX_VALUE / 10 || (result == Integer.MAX_VALUE / 10 && n > 7)) {
                return 0;
            }
            if (result < Integer.MIN_VALUE / 10 || (result == Integer.MIN_VALUE / 10 && n < -8)) {
                return 0;
            }
            result = result * 10 + n;
            x = x / 10;
        }
        return result;
    }


}
