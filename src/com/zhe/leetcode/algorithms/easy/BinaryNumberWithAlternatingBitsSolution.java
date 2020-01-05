package com.zhe.leetcode.algorithms.easy;

/**
 * 693. Binary Number with Alternating Bits
 *
 * @author zhangzhe
 */
public class BinaryNumberWithAlternatingBitsSolution {

    public static void main(String[] args) {
        int n = 5;
        System.out.println(hasAlternatingBits(n));
    }

    private static boolean hasAlternatingBits(int n) {
        String bits = Integer.toBinaryString(n);
        for (int i = 0; i < bits.length() - 1; i++) {
            if (bits.charAt(i) == bits.charAt(i + 1)) {
                return false;
            }
        }
        return true;
    }

}
