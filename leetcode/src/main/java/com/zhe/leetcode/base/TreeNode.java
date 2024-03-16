package com.zhe.leetcode.base;

import java.util.ArrayDeque;
import java.util.Deque;

/**
 * @author zhangzhe
 */
public class TreeNode {

    public int val;
    public TreeNode left;
    public TreeNode right;

    public TreeNode() {

    }

    public TreeNode(int x) {
        val = x;
    }

    public TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }

    /**
     * 递归实现前序遍历
     */
    public static void preOrderTraversal(TreeNode node) {

        System.out.print(node.val + "    ");

        if (node.left != null) {
            preOrderTraversal(node.left);
        }

        if (node.right != null) {
            preOrderTraversal(node.right);
        }

    }

    /**
     * 递归实现中序遍历
     */
    public static void inOrderTraversal(TreeNode node) {
        if (node.left != null) {
            inOrderTraversal(node.left);
        }

        System.out.print(node.val + "    ");

        if (node.right != null) {
            inOrderTraversal(node.right);
        }
    }

    /**
     * 递归实现后序遍历
     */
    public static void postOrderTraversal(TreeNode node) {
        if (node.left != null) {
            postOrderTraversal(node.left);
        }

        if (node.right != null) {
            postOrderTraversal(node.right);
        }

        System.out.print(node.val + "    ");
    }

    /**
     * 层次遍历
     */
    public static void layerTraver(TreeNode node) {
        Deque<TreeNode> queue = new ArrayDeque<>();
        queue.add(node);

        while (queue.size() > 0) {
            TreeNode n = queue.poll();
            System.out.print(n.val + "    ");
            if (n.left != null) {
                queue.add(n.left);
            }
            if (n.right != null) {
                queue.add(n.right);
            }
        }
    }

}
