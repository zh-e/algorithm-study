package com.zhe.leetcode.algorithms.easy;

import com.zhe.leetcode.algorithms.base.TreeNode;

/**
 * 700. Search in a Binary Search Tree
 *
 * @author zhangzhe
 */
public class SearchInABinarySearchTreeSolution {

    public static void main(String[] args) {
        TreeNode root = initNode();
        TreeNode res = searchBST(root, 2);
        TreeNode.inOrderTraversal(res);
    }

    private static TreeNode searchBST(TreeNode root, int val) {
        if (root == null) {
            return null;
        }

        if (root.val == val) {
            return root;
        }

        if (root.val > val) {
            return searchBST(root.left, val);
        } else {
            return searchBST(root.right, val);
        }
    }

    private static TreeNode initNode() {
        TreeNode node = new TreeNode(4);
        TreeNode node1 = new TreeNode(2);
        TreeNode node2 = new TreeNode(7);
        TreeNode node3 = new TreeNode(1);
        TreeNode node4 = new TreeNode(3);

        node.left = node1;
        node.right = node2;
        node1.left = node3;
        node1.right = node4;

        return node;
    }


}
