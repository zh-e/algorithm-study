package com.zhe.leetcode.algorithms.easy;

import java.util.HashSet;
import java.util.Set;

/**
 * 575. Distribute Candies
 *
 * @author zhangzhe
 */
public class DistributeCandiesSolution {

    public static void main(String[] args) {
        int[] candies = {1,1,2,3};
        System.out.println(distributeCandies(candies));
    }

    private static int distributeCandies(int[] candies) {
        Set<Integer> set = new HashSet<>();
        for (int i : candies) {
            set.add(i);
        }
        return Math.min(set.size(), candies.length / 2);
    }

}
