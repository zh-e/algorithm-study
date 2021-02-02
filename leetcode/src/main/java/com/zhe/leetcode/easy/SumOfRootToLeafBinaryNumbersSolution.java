package com.zhe.leetcode.easy;

import com.zhe.leetcode.base.TreeNode;

/**
 * 1022. Sum of Root To Leaf Binary Numbers
 *
 * @author zhangzhe
 */
public class SumOfRootToLeafBinaryNumbersSolution {

    public static void main(String[] args) {
        TreeNode root = init();
        System.out.println(sumRootToLeaf(root));
    }

    private static int sumRootToLeaf(TreeNode root) {
        return dfs(root, 0);
    }

    private static int dfs(TreeNode root, int val) {
        if (root == null) {
            return 0;
        }
        val = val * 2 + root.val;
        return root.left == root.right ? val : dfs(root.left, val) + dfs(root.right, val);
    }

    private static TreeNode init() {
        TreeNode root = new TreeNode(1);
        TreeNode node1 = new TreeNode(0);
        TreeNode node2 = new TreeNode(1);
        TreeNode node3 = new TreeNode(0);
        TreeNode node4 = new TreeNode(1);
        TreeNode node5 = new TreeNode(0);
        TreeNode node6 = new TreeNode(1);

        root.left = node1;
        root.right = node2;
        node1.left = node3;
        node1.right = node4;
        node2.left = node5;
        node2.right = node6;

        return root;
    }

}
