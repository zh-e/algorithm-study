package com.zhe.leetcode.algorithms.easy;

/**
 * 892. Surface Area of 3D Shapes
 * 在 N * N 的网格上，我们放置一些 1 * 1 * 1  的立方体。
 * <p>
 * 每个值 v = grid[i][j] 表示 v 个正方体叠放在对应单元格 (i, j) 上。
 * <p>
 * 请你返回最终形体的表面积。
 *
 * @author zhangzhe
 */
public class SurfaceAreaOf3DShapesSolution {

    public static void main(String[] args) {
        int[][] grid = {{1, 1, 1}, {1, 0, 1}, {1, 1, 1}};
        System.out.println(surfaceArea(grid));
    }

    private static int surfaceArea(int[][] grid) {
        int res = 0, n = grid.length;
        for (int i = 0; i < n; ++i) {
            for (int j = 0; j < n; ++j) {
                if (grid[i][j] > 0) {
                    res += grid[i][j] * 4 + 2;
                }
                if (i > 0) {
                    res -= Math.min(grid[i][j], grid[i - 1][j]) * 2;
                }
                if (j > 0) {
                    res -= Math.min(grid[i][j], grid[i][j - 1]) * 2;
                }
            }
        }
        return res;
    }

}
