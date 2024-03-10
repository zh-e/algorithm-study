package com.zhe.leetcode.medium;

import com.zhe.leetcode.base.ArrayUtils;

import java.util.Arrays;
import java.util.Comparator;
import java.util.PriorityQueue;

/**
 * 973. K Closest Points to Origin
 *
 * @author zhe
 */
public class KClosestPointsToOriginSolution {

    public static void main(String[] args) {

        int[][] points = new int[][]{{3, 3}, {5, -1}, {-2, 4}};
        int k = 2;
        KClosestPointsToOriginSolution solution = new KClosestPointsToOriginSolution();
        ArrayUtils.printArry(solution.kClosest1(points, k));
    }

    public int[][] kClosest(int[][] points, int k) {
        Arrays.sort(points, Comparator.comparingInt(o -> (o[0] * o[0] + o[1] * o[1])));
        return Arrays.copyOfRange(points, 0, k);
    }

    public int[][] kClosest1(int[][] points, int k) {
        PriorityQueue<int[]> pq = new PriorityQueue<>(Comparator.comparingInt(o -> o[0]));

        for (int i = 0; i < k; i++) {
            pq.offer(new int[]{points[i][0] * points[i][0] + points[i][1] * points[i][1], i});
        }

        int n = points.length;
        for (int i = k; i < n; i++) {
            int dist = points[i][0] * points[i][0] + points[i][1] * points[i][1];
            if (dist < pq.peek()[0]) {
                pq.poll();
                pq.offer(new int[]{dist, i});
            }
        }

        int[][] ans = new int[k][2];
        for (int i = 0; i < k; i++) {
            ans[i] = points[pq.poll()[1]];
        }

        return ans;
    }

}
