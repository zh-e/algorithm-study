package com.zhe.leetcode.algorithms.easy;

/**
 * 1013. Partition Array Into Three Parts With Equal Sum
 *
 * @author zhangzhe
 */
public class PartitionArrayIntoThreePartsWithEqualSumSolution {

    public static void main(String[] args) {
        int[] A = {0, 2, 1, -6, 6, -7, 9, 1, 2, 0, 1};
        System.out.println(canThreePartsEqualSum(A));
    }

    private static boolean canThreePartsEqualSum(int[] A) {
        int sum = 0;
        for(int num:A){
            sum+=num;
        }

        if(sum%3 != 0){
            return false;
        }
        int partSum = sum/3;
        int count = 0,tmpSum=0;
        for (int value : A) {
            tmpSum += value;
            if (tmpSum == partSum) {
                count++;
                tmpSum = 0;
            }
            if (count == 2) {
                return true;
            }
        }
        return false;
    }

}
