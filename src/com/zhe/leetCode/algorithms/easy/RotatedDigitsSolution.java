package com.zhe.leetCode.algorithms.easy;

/**
 * 788. Rotated Digits
 *
 * @author zhangzhe
 */
public class RotatedDigitsSolution {

    public static void main(String[] args) {
        System.out.println(rotatedDigits(10));
    }

    private static int rotatedDigits(int N) {
        int i = 1;
        int ans = 0;
        while (i <= N) {
            if (check(i)) {
                ans++;
            }
            i++;
        }
        return ans;
    }

    private static boolean check(Integer num) {
        boolean validFound = false;
        while (num > 0) {
            if (num % 10 == 2 || num % 10 == 5 || num % 10 == 6 || num % 10 == 9) {
                validFound = true;
            }
            if (num % 10 == 3 || num % 10 == 4 || num % 10 == 7) {
                return false;
            }
            num = num / 10;
        }
        return validFound;
    }

}
