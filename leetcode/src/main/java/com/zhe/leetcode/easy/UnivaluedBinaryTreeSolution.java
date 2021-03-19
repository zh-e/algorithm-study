package com.zhe.leetcode.easy;

import com.zhe.leetcode.base.TreeNode;

import java.util.ArrayDeque;
import java.util.Deque;

/**
 * 965. Univalued Binary Tree
 *
 * @author zhangzhe
 */
public class UnivaluedBinaryTreeSolution {

    public static void main(String[] args) {
        TreeNode root = initRoot();
        System.out.println(isUnivalTree(root));
    }

    private static boolean isUnivalTree(TreeNode root) {

        Deque<TreeNode> queue = new ArrayDeque<>();
        queue.add(root);
        int index = -1;
        while (queue.size() > 0) {
            TreeNode n = queue.poll();

            if (index == -1) {
                index = n.val;
            } else if (index != n.val) {
                return false;
            }

            if (n.left != null) {
                queue.add(n.left);
            }
            if (n.right != null) {
                queue.add(n.right);
            }
        }
        return true;
    }

    private static TreeNode initRoot() {
        TreeNode root = new TreeNode(1);
        TreeNode treeNode1 = new TreeNode(1);
        TreeNode treeNode2 = new TreeNode(1);
        TreeNode treeNode3 = new TreeNode(1);
        TreeNode treeNode4 = new TreeNode(1);

        root.left = treeNode1;
        root.right = treeNode2;

        treeNode1.left = treeNode3;
        treeNode1.right = treeNode4;

        return root;
    }

}

