package com.zhe.leetCode.algorithms.base;

/**
 * @author zhangzhe
 */
public final class ArrayUtils {

    private final static String SPACE = "  ";

    private ArrayUtils() {

    }

    public static void printArry(int[] arr) {
        for(int i : arr) {
            System.out.print(i + SPACE);
        }
        System.out.println();
    }

    public static void printArry(int[][] arr) {
        for (int[] ints : arr) {
            for (int anInt : ints) {
                System.out.print(anInt + SPACE);
            }
            System.out.println();
        }
    }

}
