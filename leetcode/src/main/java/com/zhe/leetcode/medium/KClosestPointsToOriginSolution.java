package com.zhe.leetcode.medium;

import com.zhe.leetcode.base.ArrayUtils;

import java.util.Arrays;
import java.util.Comparator;

/**
 * 973. K Closest Points to Origin
 *
 * @author zhe
 */
public class KClosestPointsToOriginSolution {

    public static void main(String[] args) {

        int[][] points = new int[][]{{3, 3}, {5, -1}, {-2, 4}};
        int k =2;
        KClosestPointsToOriginSolution solution = new KClosestPointsToOriginSolution();
        ArrayUtils.printArry(solution.kClosest(points, k));
    }

    public int[][] kClosest(int[][] points, int k) {
        Arrays.sort(points, Comparator.comparingInt(o -> (o[0] * o[0] + o[1] * o[1])));
        return Arrays.copyOfRange(points, 0, k);
    }

}
