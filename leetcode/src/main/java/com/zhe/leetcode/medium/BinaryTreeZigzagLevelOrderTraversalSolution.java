package com.zhe.leetcode.medium;

import com.zhe.leetcode.base.TreeNode;

import java.util.*;

/**
 * 103. 二叉树的锯齿形层序遍历
 * <p>
 * 给你二叉树的根节点 root ，返回其节点值的 锯齿形层序遍历 。（即先从左往右，再从右往左进行下一层遍历，以此类推，层与层之间交替进行）。
 */
public class BinaryTreeZigzagLevelOrderTraversalSolution {

    public static void main(String[] args) {
        TreeNode node1 = new TreeNode(15);
        TreeNode node2 = new TreeNode(7);
        TreeNode node3 = new TreeNode(20, node1, node2);
        TreeNode node4 = new TreeNode(9);
        TreeNode root = new TreeNode(3, node4, node3);

        BinaryTreeZigzagLevelOrderTraversalSolution solution = new BinaryTreeZigzagLevelOrderTraversalSolution();
        List<List<Integer>> res = solution.zigzagLevelOrder(root);

        System.out.println(res);
    }

    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        if (root == null) {
            return new ArrayList<>();
        }

        List<List<Integer>> res = new ArrayList<>();
        Deque<TreeNode> deque = new ArrayDeque<>();
        deque.add(root);
        boolean isOrderLeft = true;

        while (!deque.isEmpty()) {
            Deque<Integer> levelList = new LinkedList<>();
            int size = deque.size();
            for (int i = 0; i < size; i++) {
                TreeNode curNode = deque.poll();
                if (curNode == null) {
                    break;
                }
                if (isOrderLeft) {
                    levelList.offerLast(curNode.val);
                } else {
                    levelList.offerFirst(curNode.val);
                }
                if (curNode.left != null) {
                    deque.add(curNode.left);
                }
                if (curNode.right != null) {
                    deque.add(curNode.right);
                }
            }
            res.add(new ArrayList<>(levelList));
            isOrderLeft = !isOrderLeft;
        }

        return res;
    }

}
