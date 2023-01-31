package com.zhe.leetcode.easy;

/**
 * 883. Projection Area of 3D Shapes
 *
 * @author zhangzhe
 */
public class ProjectionAreaOf3DShapesSolution {

    public static void main(String[] args) {
        int[][] grid = {{1, 1, 1}, {1, 0, 1}, {1, 1, 1}};
        System.out.println(projectionArea(grid));
        ;
    }

    private static int projectionArea(int[][] grid) {
        int xLen = grid.length;
        int yLen = grid[0].length;
        int[] xMax = new int[xLen];
        int[] yMax = new int[yLen];
        int res = 0;

        for (int i = 0; i < xLen; i++) {
            for (int j = 0; j < yLen; j++) {
                xMax[j] = Math.max(grid[i][j], xMax[j]);
                yMax[i] = Math.max(grid[i][j], yMax[i]);
                if (grid[i][j] > 0) {
                    res++;
                }
            }
        }

        for (int i : xMax) {
            res += i;
        }
        for (int i : yMax) {
            res += i;
        }
        return res;
    }

}

