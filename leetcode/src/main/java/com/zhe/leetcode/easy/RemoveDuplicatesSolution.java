package com.zhe.leetcode.easy;

public class RemoveDuplicatesSolution {

    public static void main(String[] args) {
        //0 1 2 3 4
        int[] nums = new int[]{0,0,0,1,1,1,2,2,3,3,4};

        System.out.println(new RemoveDuplicatesSolution().removeDuplicates2(nums));
    }

    public int removeDuplicates(int[] nums) {
        int slow = 0;
        int fast = 1;

        while (fast < nums.length) {
            if (nums[slow] == nums[fast]) {
                fast++;
                continue;
            }
            nums[++slow] = nums[fast++];
        }

        return slow + 1;
    }

    public int removeDuplicates2(int[] nums) {
        int len = nums.length;
        if (len <= 2) {
            return len;
        }

        int slow = 2, fast = 2;
        while (fast < len) {
            if (nums[slow - 2] != nums[fast]) {
                nums[slow] = nums[fast];
                slow++;
            }
            fast++;
        }
        return slow;
    }

}
