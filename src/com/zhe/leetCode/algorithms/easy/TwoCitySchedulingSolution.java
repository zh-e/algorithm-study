package com.zhe.leetCode.algorithms.easy;

import java.util.Arrays;
import java.util.Comparator;

/**
 * 1029. Two City Scheduling
 *
 * @author zhangzhe
 */
public class TwoCitySchedulingSolution {

    public static void main(String[] args) {
        int[][] costs = {{10, 20}, {30, 200}, {400, 50}, {30, 20}};
        System.out.println(twoCitySchedCost(costs));
    }

    private static int twoCitySchedCost(int[][] costs) {
        Arrays.sort(costs, Comparator.comparingInt(a -> (a[1] - a[0])));
        int cost = 0;
        for (int i = 0, len = costs.length / 2; i < len; i++) {
            cost += costs[i][1] + costs[costs.length - 1 - i][0];
        }
        return cost;
    }

}
