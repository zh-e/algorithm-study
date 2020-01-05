package com.zhe.leetcode.algorithms.easy;

import com.zhe.leetcode.algorithms.base.TreeNode;

/**
 * 669. Trim a Binary Search Tree
 *
 * @author zhangzhe
 */
public class TrimABinarySearchTreeSolution {

    public static void main(String[] args) {
        TreeNode root = initRoot();
        TreeNode.layerTraver(trimBST(root, 1, 3));
    }

    private static TreeNode trimBST(TreeNode root, int L, int R) {
        if (root == null) {
            return root;
        }
        if (root.val > R) {
            return trimBST(root.left, L, R);
        }
        if (root.val < L) {
            return trimBST(root.right, L, R);
        }

        root.left = trimBST(root.left, L, R);
        root.right = trimBST(root.right, L, R);
        return root;
    }

    private static TreeNode initRoot() {
        TreeNode root = new TreeNode(3);
        TreeNode node1 = new TreeNode(0);
        TreeNode node2 = new TreeNode(4);
        TreeNode node3 = new TreeNode(2);
        TreeNode node4 = new TreeNode(1);

        root.left = node1;
        root.right = node2;
        node1.right = node3;
        node3.left = node4;

        return root;
    }

}
