package com.zhe.leetcode.medium;

/**
 * @author zhangzhe
 * String to Integer
 */
public class StringToIntegerSolution {

    public static void main(String[] args) {
        System.out.println(myAtoi("+1"));
    }

    private static int myAtoi(String str) {

        if (str.isEmpty() || str.trim().isEmpty()) {
            return 0;
        }

        str = str.trim();
        int sign = 1, i = 0;
        if (str.charAt(0) == '-') {
            sign = -1;
            i = 1;
        } else if (str.charAt(0) == '+') {
            i = 1;
        }
        int num = 0;
        for (int len = str.length(); i < len; i++) {
            if (Character.isDigit(str.charAt(i))) {
                int n = Integer.parseInt(str.charAt(i) + "");
                if (num > Integer.MAX_VALUE / 10 || (num == Integer.MAX_VALUE / 10 && n > 7)) {
                    if (sign < 0) {
                        return Integer.MIN_VALUE;
                    }
                    return Integer.MAX_VALUE;
                } else {
                    num = num * 10 + n;
                }
            } else {
                break;
            }
        }

        return num * sign;
    }

}