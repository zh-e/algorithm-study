package com.zhe.leetcode.algorithms.easy;

/**
 * 121. Best Time to Buy and Sell Stock
 *
 * @author zhe
 */
public class BestTimeToBuyAndSellStockSolution {

    public static void main(String[] args) {
        int[] nums = new int[]{7, 1, 5, 3, 6, 4};
        System.out.println(maxProfit(nums));
    }

    public static int maxProfit(int[] prices) {
        int min = Integer.MAX_VALUE;
        int maxPrice = 0;
        for (int price : prices) {
            if (price < min) {
                min = price;
            } else if (price - min > maxPrice) {
                maxPrice = price - min;
            }
        }
        return maxPrice;
    }

}
