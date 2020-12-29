package com.zhe.leetcode.easy;

import java.util.Arrays;

/**
 * 1051. Height Checker
 *
 * @author zhangzhe
 */
public class HeightCheckerSolution {

    public static void main(String[] args) {
        int[] heights = {1,1,4,2,5,1,3};
        System.out.println(heightChecker(heights));
    }

    private static int heightChecker(int[] heights) {
        int[] copys = heights.clone();
        Arrays.sort(copys);
        int res = 0;
        for(int i = 0, len = heights.length; i < len; i++) {
            if(heights[i] != copys[i]) {
                res ++;
            }
        }
        return res;
    }
}
