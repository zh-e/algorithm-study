package com.zhe.leetcode.algorithms.easy;

import com.zhe.leetcode.algorithms.base.TreeNode;

/**
 * 104. Maximum Depth of Binary Tree
 *
 * @author zhangzhe
 */
public class MaximumDepthOfBinaryTreeSolution {

    public static void main(String[] args) {
        TreeNode root = initRoot();
        System.out.println(maxDepth(root));
    }

    private static int maxDepth(TreeNode root) {
        int depth = 1;
        if (root == null) {
            return 0;
        }
        if (root.left == null && root.right == null) {
            return depth;
        }
        depth = Math.max(depth, maxDepth(root.left) + 1);
        depth = Math.max(depth, maxDepth(root.right) + 1);
        return depth;
    }

    private static TreeNode initRoot() {
        TreeNode root = new TreeNode(3);
        TreeNode node1 = new TreeNode(9);
        TreeNode node2 = new TreeNode(20);
        TreeNode node3 = new TreeNode(15);
        TreeNode node4 = new TreeNode(7);

        root.left = node1;
        root.right = node2;
        node2.left = node3;
        node2.right = node4;

        return root;
    }

}
