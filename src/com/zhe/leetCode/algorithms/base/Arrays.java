package com.zhe.leetCode.algorithms.base;

/**
 * @author zhangzhe
 */
public final class Arrays {

    public static void printArry(int[] arr) {
        for(int i : arr) {
            System.out.print(i + "  ");
        }
        System.out.println();
    }

    public static void printArry(int[][] arr) {
        for (int[] ints : arr) {
            for (int anInt : ints) {
                System.out.print(anInt + "  ");
            }
            System.out.println();
        }
    }

}
