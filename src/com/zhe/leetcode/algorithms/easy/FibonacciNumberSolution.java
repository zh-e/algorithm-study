package com.zhe.leetcode.algorithms.easy;

/**
 * 509. Fibonacci Number
 *
 * @author zhangzhe
 */
public class FibonacciNumberSolution {

    public static void main(String[] args) {
        int n = 3;
        System.out.println(fib(n));
    }

    private static int fib(int N) {
        if(N == 0 || N== 1) {
            return N;
        }
        return fib(N - 1) + fib(N - 2);
    }

}
