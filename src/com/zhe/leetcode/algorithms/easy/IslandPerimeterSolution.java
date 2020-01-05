package com.zhe.leetcode.algorithms.easy;

/**
 * 463. Island Perimeter
 *
 * @author zhangzhe
 */
public class IslandPerimeterSolution {

    public static void main(String[] args) {
        int[][] grid = {
                {0, 1, 0, 0},
                {1, 1, 1, 0},
                {0, 1, 0, 0},
                {1, 1, 0, 0}
        };
        System.out.println(islandPerimeter(grid));
    }

    private static int islandPerimeter(int[][] grid) {
        int islands = 0, neighbours = 0;
        for (int i = 0, r = grid.length - 1; i <= r; i++) {
            for (int j = 0, c = grid[i].length - 1; j <= c; j++) {
                if (grid[i][j] == 0) {
                    continue;
                }
                islands++;
                if (i < r && grid[i + 1][j] == 1) {
                    neighbours++;
                }
                if (j < c && grid[i][j + 1] == 1) {
                    neighbours++;
                }
            }
        }
        return islands * 4 - neighbours * 2;
    }

}
