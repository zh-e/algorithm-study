package com.zhe.leetcode.easy;

/**
 * 461. Hamming Distance
 *
 * @author zhangzhe
 */
public class HammingDistanceSolution {

    public static void main(String[] args) {
        System.out.println(hammingDistance(1, 4));
    }

    private static int hammingDistance(int x, int y) {
        return y == 0 ? (x == 0 ? 0 : 1 + hammingDistance(x & (x - 1), 0)) : hammingDistance(x ^ y, 0);
    }

}
