package com.zhe.leetcode.algorithms.easy;

/**
 * 确定整数是否是回文。 当它向前读取向后时，整数是回文。
 *
 * @author zhangzhe
 */
public class PalindromeNumberSolution {

    public static void main(String[] args) {
        System.out.println(isPalindrome(10));
    }

    private static boolean isPalindrome(int x) {
        if (x < 0) {
            return Boolean.FALSE;
        }

        if (x > 0 && x < 10) {
            return Boolean.TRUE;
        }

        String str = String.valueOf(x);
        char[] chars = str.toCharArray();

        for (int i = 0, n = chars.length - 1; i <= n / 2; i++) {

            if (chars[i] != chars[n - i]) {
                return Boolean.FALSE;
            }

        }
        return Boolean.TRUE;
    }

}
