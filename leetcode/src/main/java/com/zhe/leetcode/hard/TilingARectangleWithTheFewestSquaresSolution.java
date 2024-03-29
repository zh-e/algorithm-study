package com.zhe.leetcode.hard;

/**
 * 1240. 铺瓷砖
 * 你是一位施工队的工长，根据设计师的要求准备为一套设计风格独特的房子进行室内装修。
 *
 * 房子的客厅大小为 n x m，为保持极简的风格，需要使用尽可能少的 正方形 瓷砖来铺盖地面。
 *
 * 假设正方形瓷砖的规格不限，边长都是整数。
 */
public class TilingARectangleWithTheFewestSquaresSolution {

    public static void main(String[] args) {
        TilingARectangleWithTheFewestSquaresSolution squaresSolution = new TilingARectangleWithTheFewestSquaresSolution();

        System.out.println(squaresSolution.tilingRectangle(11, 13));
    }

    public int tilingRectangle(int n, int m) {
        if (n == m) {
            return 1;
        }

        if (n == 1) {
            return m;
        }

        if (m == 1) {
            return n;
        }

        if (n > m) {
            return tilingRectangle(n - m, m) + 1;
        }
        return tilingRectangle(n, m - n) + 1;
    }



}


