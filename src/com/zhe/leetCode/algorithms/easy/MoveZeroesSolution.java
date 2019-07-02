package com.zhe.leetCode.algorithms.easy;

import com.zhe.leetCode.algorithms.base.ArrayUtils;

/**
 * 283. Move Zeroes
 *
 * @author zhangzhe
 */
public class MoveZeroesSolution {

    public static void main(String[] args) {
        int[] nums = {0, 1, 0, 3, 12};
        moveZeroes(nums);
        ArrayUtils.printArry(nums);
    }

    private static void moveZeroes(int[] nums) {

        if(nums==null||nums.length<1) {
            return;
        }
        int currIndex=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=0){
                int temp = nums[currIndex];
                nums[currIndex] = nums[i];
                nums[i] = temp;
                currIndex++;
            }
        }

    }

}
