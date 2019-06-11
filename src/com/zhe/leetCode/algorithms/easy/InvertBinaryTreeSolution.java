package com.zhe.leetCode.algorithms.easy;

import com.zhe.leetCode.algorithms.base.TreeNode;

import java.util.ArrayDeque;
import java.util.Deque;

/**
 * 226. Invert Binary Tree
 *
 * @author zhangzhe
 */
public class InvertBinaryTreeSolution {

    public static void main(String[] args) {
        TreeNode root = initRoot();
        TreeNode.layerTraver(invertTree(root));
    }

    /**
     * 非递归实现
     */
    private static TreeNode invertTree(TreeNode root) {
        if (root == null) {
            return root;
        }
        Deque<TreeNode> queue = new ArrayDeque<>();
        queue.add(root);
        while (queue.size() > 0) {
            TreeNode node = queue.poll();
            TreeNode temp = node.left;
            node.left = node.right;
            node.right = temp;
            if (node.left != null) {
                queue.add(node.left);
            }
            if (node.right != null) {
                queue.add(node.right);
            }
        }
        return root;
    }

    /**
     * 递归实现
     */
    private static TreeNode invertTree1(TreeNode root) {
        if (root == null) {
            return null;
        }
        TreeNode right = invertTree1(root.right);
        TreeNode left = invertTree1(root.left);
        root.left = right;
        root.right = left;
        return root;
    }

    private static TreeNode initRoot() {
        TreeNode root = new TreeNode(4);
        TreeNode node1 = new TreeNode(2);
        TreeNode node2 = new TreeNode(7);
        TreeNode node3 = new TreeNode(1);
        TreeNode node4 = new TreeNode(3);
        TreeNode node5 = new TreeNode(6);
        TreeNode node6 = new TreeNode(9);

        root.left = node1;
        root.right = node2;
        node1.left = node3;
        node1.right = node4;
        node2.left = node5;
        node2.right = node6;

        return root;
    }

}
