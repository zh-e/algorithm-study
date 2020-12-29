package com.zhe.leetcode.easy;

/**
 * 292. Nim Game
 *
 * @author zhangzhe
 */
public class NimGameSolution {

    public static void main(String[] args) {
        System.out.println(canWinNim(4));
    }

    private static boolean canWinNim(int n) {
        return (n % 4 != 0);
    }

}
