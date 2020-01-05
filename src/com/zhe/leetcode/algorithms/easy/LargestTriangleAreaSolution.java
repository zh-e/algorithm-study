package com.zhe.leetcode.algorithms.easy;

/**
 * 812. Largest Triangle Area
 *
 * @author zhangzhe
 */
public class LargestTriangleAreaSolution {

    public static void main(String[] args) {
        int[][] points = {{0,0},{0,1},{1,0},{0,2},{2,0}};
        System.out.println(largestTriangleArea(points));
    }

    private static double largestTriangleArea(int[][] points) {
        int length = points.length;
        double ans = 0;
        for (int i = 0; i < length; ++i) {
            for (int j = i + 1; j < length; ++j) {
                for (int k = j + 1; k < length; ++k) {
                    ans = Math.max(ans, area(points[i], points[j], points[k]));
                }
            }
        }
        return ans;
    }

    private static double area(int[] p, int[] q, int[] r) {
        return 0.5 * Math.abs(p[0] * q[1] + q[0] * r[1] + r[0] * p[1]
                - p[1] * q[0] - q[1] * r[0] - r[1] * p[0]);
    }

}
