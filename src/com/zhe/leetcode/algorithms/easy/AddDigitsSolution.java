package com.zhe.leetcode.algorithms.easy;

/**
 * 258. Add Digits
 *
 * @author zhangzhe
 */
public class AddDigitsSolution {

    public static void main(String[] args) {
        int num = 38;
        System.out.println(addDigits(num));
    }

    private static int addDigits(int num) {
        if (num == 0) {
            return 0;
        }
        if (num % 9 == 0) {
            return 9;
        }
        return num % 9;
    }

}
