package com.zhe.leetCode.algorithms.easy;

import com.zhe.leetCode.algorithms.base.ArrayUtils;

/**
 * 1103. Distribute Candies to People
 *
 * @author zhangzhe
 */
public class DistributeCandiesToPeopleSolution {

    public static void main(String[] args) {
        int candies = 60;
        int numPeople = 4;
        ArrayUtils.printArry(distributeCandies(candies, numPeople));
    }

    private static int[] distributeCandies(int candies, int num_people) {
        int[] ans = new int[num_people];
        int i = 0;
        int num = 1;
        while (candies > 0) {
            if (num > candies) {
                num = candies;
                candies = 0;
            } else {
                candies -= num;
            }
            ans[i] += num;
            i++;
            num ++;
            if (i >= num_people) {
                i = 0;
            }
        }
        return ans;
    }

}
