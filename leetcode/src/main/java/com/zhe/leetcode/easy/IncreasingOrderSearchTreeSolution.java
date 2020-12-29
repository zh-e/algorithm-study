package com.zhe.leetcode.easy;


import com.zhe.leetcode.base.TreeNode;

import java.util.Stack;

/**
 * 897. Increasing Order Search Tree
 *
 * @author zhangzhe
 */
public class IncreasingOrderSearchTreeSolution {

    public static void main(String[] args) {
        TreeNode root = initRoot();
        TreeNode treeNode = increasingBST(root);
        TreeNode.layerTraver(treeNode);
    }

    private static TreeNode increasingBST(TreeNode root) {
        TreeNode res = new TreeNode(0);
        TreeNode cur = res;
        Stack<TreeNode> stack = new Stack<>();
        while (root != null || !stack.empty()) {
            while (root != null) {
                stack.push(root);
                root = root.left;
            }
            if (!stack.empty()) {
                root = stack.pop();
                cur.right = new TreeNode(root.val);
                cur = cur.right;
                root = root.right;
            }
        }
        return res.right;
    }

    private static TreeNode initRoot() {
        TreeNode root = new TreeNode(5);
        TreeNode node1 = new TreeNode(3);
        TreeNode node2 = new TreeNode(6);
        TreeNode node3 = new TreeNode(2);
        TreeNode node4 = new TreeNode(4);
        TreeNode node5 = new TreeNode(8);
        TreeNode node6 = new TreeNode(1);
        TreeNode node7 = new TreeNode(7);
        TreeNode node8 = new TreeNode(9);
        root.left = node1;
        root.right = node2;
        node1.left = node3;
        node1.right = node4;
        node2.right = node5;
        node3.left = node6;
        node5.left = node7;
        node5.right = node8;
        return root;
    }


}
