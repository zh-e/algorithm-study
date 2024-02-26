package com.zhe.leetcode.hard;

import com.zhe.leetcode.base.TreeNode;

public class MaxPathSumSolution {

    Integer maxSum = Integer.MIN_VALUE;
    public static void main(String[] args) {

    }

    public int maxPathSum(TreeNode root) {

        max(root);
        return maxSum;
    }

    public int max(TreeNode root) {
        if (root == null) {
            return 0;
        }

        int left = Math.max(max(root.left), 0);
        int right = Math.max(max(root.right), 0);

        int max = root.val + left + right;

        maxSum = Math.max(max, maxSum);

        return root.val + Math.max(left , right);

    }

}
