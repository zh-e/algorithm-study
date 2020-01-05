package com.zhe.leetcode.algorithms.easy;

/**
 * 1025. Divisor Game
 *
 * @author zhangzhe
 */
public class DivisorGameSolution {

    public static void main(String[] args) {
        int N = 3;
        System.out.println(divisorGame(N));
    }

    private static boolean divisorGame(int N) {
        return N % 2 == 0;
    }

}
